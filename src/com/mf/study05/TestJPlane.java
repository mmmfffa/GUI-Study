package com.mf.study05;

import javax.swing.*;
import java.awt.*;

/**
 * @author mf
 * @create 2021-05-12-19:03
 */
public class TestJPlane extends JFrame {

    public TestJPlane() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(2,1,10,10));//最后两个参数表示上下间距

        JPanel jPanel1 = new JPanel(new GridLayout(1,3));
        JPanel jPanel2 = new JPanel(new GridLayout(1,2));
        JPanel jPanel3 = new JPanel(new GridLayout(2,1));
        JPanel jPanel4 = new JPanel(new GridLayout(3,2));

        jPanel1.add(new JButton("1-1"));
        jPanel1.add(new JButton("1-2"));
        jPanel1.add(new JButton("1-3"));

        jPanel2.add(new JButton("2-1"));
        jPanel2.add(new JButton("2-2"));

        jPanel3.add(new JButton("3-1"));
        jPanel3.add(new JButton("3-2"));

        jPanel4.add(new JButton("4-1"));
        jPanel4.add(new JButton("4-2"));
        jPanel4.add(new JButton("4-3"));
        jPanel4.add(new JButton("4-4"));
        jPanel4.add(new JButton("4-5"));
        jPanel4.add(new JButton("4-6"));



        contentPane.add(jPanel1);
        contentPane.add(jPanel2);
        contentPane.add(jPanel3);
        contentPane.add(jPanel4);

        setVisible(true);
        setBounds(200,200,400,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new TestJPlane();
    }
}
