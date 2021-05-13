package com.mf.study01;

import java.awt.*;

/**
 * @author mf
 * @create 2021-05-11-8:35
 */
//GUI第一个界面程序
public class TestFrame {

    public static void main(String[] args) {
        //Frame学习：JDK,看源码！
        Frame frame = new Frame("第一个Java的GUI窗口");
        //需要设置可见性,窗口大小w，h，背景颜色
        frame.setVisible(true);
        frame.setSize(400,400);
        //new Color(r,g,b);
        frame.setBackground(Color.pink);
        //弹出的初始位置
        frame.setLocation(200,200);
        //设置大小固定
        frame.setResizable(false);

    }

}
