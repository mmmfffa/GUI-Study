package com.mf.study06;

import javax.swing.*;
import java.awt.*;

/**
 * @author mf
 * @create 2021-05-12-19:57
 */
public class TestJList extends JFrame {
    public TestJList() {
        Container contentPane = getContentPane();

        String[] contents={"热映电影","你的婚礼","秘密访客"};
        //可以用其他集合动态放入删减
        JList<Object> jList= new JList<>(contents);
        contentPane.add(jList);


        setVisible(true);
        setBounds(200,200,400,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestJList();
    }
}
