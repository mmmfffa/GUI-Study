package com.mf.Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/**
 * @author mf
 * @create 2021-05-12-20:25
 */
public class GamePanel extends JPanel implements KeyListener, ActionListener {
    //定义蛇的数据结构
    int length;
    int[] snakeX=new int[600];
    int[] snakeY=new int[600];
    String direct="right";
    //游戏当前的状态：开始，停止
    boolean isStart=false;
    //定时器
    Timer timer=new Timer(100,this);//100ms执行一次,监听this对象
    //食物坐标
    int foodX;
    int foodY;
    Random random=new Random();

    //失败
    boolean isFail=false;
    //积分
    int score;

    public GamePanel() {
        init();
        //获得焦点赫尔键盘事件
        this.setFocusable(true);
        //获取键盘事件
        this.addKeyListener(this);
        timer.start();//游戏一开始定时器就启动

        //食物随机分布
        foodX=25+25*random.nextInt(34);
        foodY=75+25*random.nextInt(24);
    }

    public void  init(){
        length=3;
        snakeX[0]=100;snakeY[0]=100;
        snakeX[1]=75;snakeY[1]=100;
        snakeX[2]=50;snakeY[2]=100;
        score=0;
    }


    //绘制面板
    @Override
    protected void paintComponent(Graphics g) {
       //清屏
       super.paintComponent(g);
       //绘制静态面板
        Data.header.paintIcon(this,g,25,11); //头部栏
        g.setColor(new Color(246, 248, 222, 255));
        g.fillRect(25,75,850,600);//默认游戏界面
        g.setColor(Color.black);

        g.setColor(new Color(238, 162, 31, 255));
        //设置字体
        g.setFont(new Font("微软雅黑",Font.BOLD,25));
        g.drawString("长度"+length,750,25);
        g.drawString("分数"+score,750,50);

        //画食物
        Data.food.paintIcon(this,g,foodX,foodY);

        //把小蛇画上去
        if(direct.equals("right")) Data.right.paintIcon(this,g,snakeX[0],snakeY[0]);
        else if(direct.equals("left")) Data.left.paintIcon(this,g,snakeX[0],snakeY[0]);
        else if(direct.equals("up")) Data.up.paintIcon(this,g,snakeX[0],snakeY[0]);
        else if(direct.equals("down")) Data.down.paintIcon(this,g,snakeX[0],snakeY[0]);


        for (int i = 1; i < length; i++) {
            Data.body.paintIcon(this,g,snakeX[i],snakeY[i]);
        }



        //游戏状态
        if(!isStart){
            g.setColor(Color.pink);
            //设置字体
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("按下空格开始游戏",300,300);
        }

        if(isFail){
            g.setColor(Color.pink);
            //设置字体
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("游戏失败,按下空格重新开始",300,300);
        }
    }



    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if(keyCode==KeyEvent.VK_SPACE){
            //空格有两个作用，暂停和重新开始
            if(isFail){
                isFail=false;
                init();
            }else {
                isStart=!isStart;
            }
            repaint();
        }
        //小蛇移动
        if(direct.equals("down")&&keyCode==KeyEvent.VK_UP) direct="down";
        else if(direct.equals("up")&&keyCode==KeyEvent.VK_DOWN) direct="up";
        else if(direct.equals("left")&&keyCode==KeyEvent.VK_RIGHT) direct="right";
        else if(direct.equals("right")&&keyCode==KeyEvent.VK_LEFT) direct="left";
        else if(keyCode==KeyEvent.VK_UP){
            direct="up";
        }else if(keyCode==KeyEvent.VK_DOWN){
            direct="down";
        }else if(keyCode==KeyEvent.VK_LEFT){
            direct="left";
        }else if(keyCode==KeyEvent.VK_RIGHT){
            direct="right";
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyTyped(KeyEvent e) {}

    //事件监听，来一个定时器，需要通过固定事件来刷新，1=10次
    @Override
    public void actionPerformed(ActionEvent e) {
        //如果游戏是开始状态,就让小蛇动起来
        if(isStart&&!isFail){
            //判断吃食物
            if(snakeX[0]==foodX&&snakeY[0]==foodY){
                length++;
                score+=10;
                if(score<150)
                  timer.setDelay(150-score);

                foodX=25+25*random.nextInt(34);
                foodY=75+25*random.nextInt(24);
            }

           //右移
            //移动
            for (int i = length-1; i >0; i--) {//向前移动一节
                snakeX[i]=snakeX[i-1];
                snakeY[i]=snakeY[i-1];

            }
            //走向
            if(direct.equals("right")){
                snakeX[0]+=25;
                //边界判断
                if(snakeX[0]>850) snakeX[0]=25;
            }else if(direct.equals("left")){
                snakeX[0]-=25;
                //边界判断
                if(snakeX[0]<25) snakeX[0]=850;
            }else if(direct.equals("down")){
                snakeY[0]+=25;
                //边界判断
                if(snakeY[0]>650) snakeY[0]=75;
            }else if(direct.equals("up")){
                snakeY[0]-=25;
                //边界判断
                if(snakeY[0]<75) snakeY[0]=650;
            }

            //失败判断，撞到自己就算失败
            for(int i=1;i<length;i++){
                if(snakeX[0]==snakeX[i]&&snakeY[0]==snakeY[i])
                      isFail=true;
            }

            repaint();//遍历完需要重画一下
        }
        timer.start();
    }
}
