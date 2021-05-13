package com.mf.study01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author mf
 * @create 2021-05-11-9:20
 */
//panel可以看成一个空间，但是不能单独存在
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();//布局的概念

        frame.setLayout(null);//设置布局
        frame.setBounds(300,300,500,500);
        frame.setBackground(Color.green);

        //panel设置坐标相对frame
        panel.setBounds(50,50,200,200);
        panel.setBackground(Color.white);

        frame.add(panel);
        frame.setVisible(true);

        //监听事件，监听窗口关闭事件  System.exit(0)
        //适配器模式
        frame.addWindowListener(new WindowAdapter() {
            //窗口点击关闭的时候需要做的事情
            @Override
            public void windowClosing(WindowEvent e) {
                //结束程序
                System.exit(0);
            }
        });
    }
}
