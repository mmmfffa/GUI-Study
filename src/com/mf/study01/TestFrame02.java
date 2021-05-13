package com.mf.study01;

import java.awt.*;

/**
 * @author mf
 * @create 2021-05-11-8:59
 */
class MyFrame extends Frame {
    static int id=0;//存在多个窗口，需要计数
    public MyFrame(int x,int y,int w,int h,Color color) {
        super("myFrame+"+(++id));//继承并构造
        setBounds(x,y,w,h);
        setBackground(color);
        setVisible(true);
        setResizable(false);

    }
}
public class TestFrame02 {
    public static void main(String[] args) {
        //展示多个窗口 new  继承
        MyFrame myFrame1 = new MyFrame(100, 100, 200, 200, Color.GREEN);
        MyFrame myFrame2= new MyFrame(300, 100, 200, 200, Color.white);
        MyFrame myFrame3 = new MyFrame(100, 300, 200, 200, Color.yellow);
        MyFrame myFrame4 = new MyFrame(300, 300, 200, 200, Color.pink);

    }
}
