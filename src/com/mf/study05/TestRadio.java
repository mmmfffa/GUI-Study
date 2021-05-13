package com.mf.study05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author mf
 * @create 2021-05-12-19:37
 */
public class TestRadio extends JFrame {
    public TestRadio() {
        Container contentPane = getContentPane();

        //单选框只能选一个，分组,一个组中只能选择一个
        JRadioButton jRadioButton1 = new JRadioButton("JRadio01");
        JRadioButton jRadioButton2 = new JRadioButton("JRadio02");
        JRadioButton jRadioButton3 = new JRadioButton("JRadio03");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        buttonGroup.add(jRadioButton3);

        contentPane.add(jRadioButton1,BorderLayout.NORTH);
        contentPane.add(jRadioButton2,BorderLayout.CENTER);
        contentPane.add(jRadioButton3,BorderLayout.SOUTH);

        setVisible(true);
        setBounds(200,200,400,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestRadio();
    }
}
