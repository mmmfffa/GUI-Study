package com.mf.study01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author mf
 * @create 2021-05-11-14:35
 */
public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();
        //组件-按钮
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        //设置流式布局
//        frame.setLayout(new FlowLayout());//居中
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setSize(200,200);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
