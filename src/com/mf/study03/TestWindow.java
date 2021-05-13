package com.mf.study03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author mf
 * @create 2021-05-12-10:14
 */
public class TestWindow {
    public static void main(String[] args) {
         new WindFrame();
    }
}
class WindFrame extends Frame{
    public WindFrame(){
        setBounds(200,200,400,400);
        setBackground(Color.blue);
        setVisible(true);
        addWindowListener(
                //匿名内部类
                new WindowAdapter() {
                    @Override
                    public void windowOpened(WindowEvent e) {
                        System.out.println("windowOpened");
                    }
                    //关闭窗口
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.out.println("windowClosing");
                        System.exit(0);
                    }

                    @Override
                    public void windowClosed(WindowEvent e) {
                        System.out.println("windowClosed");
                    }
                    //激活窗口
                    @Override
                    public void windowActivated(WindowEvent e) {
                        WindFrame windFrame =(WindFrame) e.getSource();
                        windFrame.setTitle("窗口被激活了");
                        System.out.println("windowActivated");
                    }
                }

        );

    }
}