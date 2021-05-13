package com.mf.study06;

import javax.swing.*;
import java.awt.*;

/**
 * @author mf
 * @create 2021-05-12-19:50
 */
public class TestComboBox extends JFrame {
    public TestComboBox(){
        Container contentPane = getContentPane();

        JComboBox<Object> jComboBox = new JComboBox<>();
        jComboBox.addItem(null);
        jComboBox.addItem("热映电影");
        jComboBox.addItem("你的婚礼");
        jComboBox.addItem("秘密访客");

        contentPane.add(jComboBox);
        setVisible(true);
        setBounds(200,200,400,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestComboBox();
    }
}
