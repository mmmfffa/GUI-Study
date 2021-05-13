package com.mf.study05;

import javax.swing.*;
import java.awt.*;

/**
 * @author mf
 * @create 2021-05-12-19:44
 */
public class TestCheckBox extends JFrame {
    public TestCheckBox(){
        Container contentPane = getContentPane();

        JCheckBox jCheckBox01 = new JCheckBox("JCheckBox01");
        JCheckBox jCheckBox02 = new JCheckBox("JCheckBox02");
        contentPane.add(jCheckBox01,BorderLayout.NORTH);
        contentPane.add(jCheckBox02,BorderLayout.SOUTH);

        setVisible(true);
        setBounds(200,200,400,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestCheckBox();
    }
}
