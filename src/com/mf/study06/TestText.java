package com.mf.study06;

import javax.swing.*;
import java.awt.*;

/**
 * @author mf
 * @create 2021-05-12-20:03
 */
public class TestText extends JFrame {
    public TestText() {
        Container contentPane = getContentPane();
/*        JTextField jTextField1 = new JTextField("Hello");
        JTextField jTextField2 = new JTextField("文本框",20);*/

        JPasswordField jPasswordField1 = new JPasswordField("Hello");
        JPasswordField jPasswordField2 = new JPasswordField("文本框", 20);
        //可以设置隐藏样式
        jPasswordField1.setEchoChar('*');
        contentPane.add(jPasswordField1,BorderLayout.NORTH);
        contentPane.add(jPasswordField2,BorderLayout.SOUTH);
        setVisible(true);
        setBounds(200,200,400,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
       new TestText();
    }
}
