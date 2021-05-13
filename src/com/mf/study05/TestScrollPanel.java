package com.mf.study05;

import javax.swing.*;
import java.awt.*;

/**
 * @author mf
 * @create 2021-05-12-19:15
 */
public class TestScrollPanel extends JFrame {
    public TestScrollPanel(){
        Container contentPane = getContentPane();

        //文本域
        JTextArea jTextArea = new JTextArea(20,50);
        jTextArea.setText("欢迎学习文本域");
        //应该放到ScrollPanel面板中
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.add(jTextArea);
        contentPane.add(scrollPane);

        setBounds(200,200,700,500);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
       new TestScrollPanel();
    }
}
