package com.mf.study03;

import com.mf.study03.uitls.windowsClose;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author mf
 * @create 2021-05-12-9:26
 */
//鼠标监听事件
public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画图");
    }

}
class MyFrame extends Frame{
    //画画需要画笔，需要监听鼠标当前的位置，需要集合来存储点
    ArrayList points;
    public MyFrame(String title) {
        super(title);
        setBounds(300,300,700,700);
        //存在鼠标点击的点
        points=new ArrayList<>();
        addMouseListener(new MyMouseListener());

        setVisible(true);
        new windowsClose().close(this);
    }
    //画画需要画笔

    @Override
    public void paint(Graphics g) {
        //画画，监听鼠标监听器
        Iterator iterator = points.iterator();
        while (iterator.hasNext()){
            Point point = (Point) iterator.next();
            g.setColor(Color.green);
            g.fillOval(point.x,point.y,10,10);
        }
    }
    //添加一个点到界面上
    public void  addPaint(Point point){
         points.add(point);
    }

    //不使用MouseLister需要重写接口所有方法，采用适配器模式实现
    static class MyMouseListener extends MouseAdapter{
        //鼠标，按下，弹起，按住不放

        @Override
        public void mousePressed(MouseEvent e) {
           MyFrame myFrame =(MyFrame) e.getSource();//拿到这个窗口
            //这里点击的时候，就会在界面上产生一个点!画笔
            myFrame.addPaint(new Point(e.getX(),e.getY()));

            //每次点击鼠标都需要重新画一遍
            myFrame.repaint();//只要点击鼠标都会刷新一遍   30帧
        }
    }
}