package com.mf.study02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author mf
 * @create 2021-05-11-20:50
 */
public class TestActionEvent {
    //关闭窗口事件
    public  static  void windowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        //按下按钮，触发一些事件
        Frame frame = new Frame();
        Button button = new Button();
        button.addActionListener(new MyActionListener());//因为需要ActionListener
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setBounds(400,400,500,500);
        frame.setBackground(Color.pink);

        windowClose(frame);
        frame.setVisible(true);

    }
}
class MyActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
          System.out.println("aaa");
    }
}
