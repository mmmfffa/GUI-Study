package com.mf.study04;

import javax.swing.*;
import java.awt.*;

/**
 * @author mf
 * @create 2021-05-12-15:57
 */
public class TestJFrame {
    //init();初始化一个方法
    public void init(){
        //顶级窗口
        JFrame jFrame = new JFrame("JFrame窗口");
        jFrame.setVisible(true);
        jFrame.setBounds(200,200,700,500);
        //jFrame.setBackground(Color.GREEN);
        //设置文字jLabel
        JLabel jLabel = new JLabel("欢迎学习JLabel!");
        jFrame.add(jLabel);
        //文字居中
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //容器实例化
        Container contentPane = jFrame.getContentPane();
        contentPane.setBackground(Color.GREEN);

        //JFrame默认实现了关闭窗口事件
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        //建立一个窗口
        new  TestJFrame().init();
    }
}