package com.mf.study03;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author mf
 * @create 2021-05-12-15:42
 */
//键盘监听
public class TestKeyListener {
    public static void main(String[] args) {
         new KeyFrame();
    }
}
class KeyFrame extends Frame{
    public KeyFrame() {
        setBounds(200,200,400,400);
        setBackground(Color.pink);
        setVisible(true);

        //监听键盘事件
        addKeyListener(new KeyAdapter() {
            //键盘按下
            @Override
            public void keyPressed(KeyEvent e) {
                //键盘按下的键是哪一个,键盘的码
                int keyCode = e.getKeyCode();
                System.out.println(keyCode);
                if(keyCode==KeyEvent.VK_UP){
                    System.out.println("按下了up键");
                }
               //根据按下不同的键，不同操作产生不同结果
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}