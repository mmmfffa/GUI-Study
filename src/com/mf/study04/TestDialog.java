package com.mf.study04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author mf
 * @create 2021-05-12-16:17yy
 */
//主窗口
public class TestDialog extends JFrame {
    public TestDialog() {
        setVisible(true);
        setBounds(200,200,600,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //JFrame容器，放东西
        Container contentPane = this.getContentPane();
        contentPane.setBackground(new Color(43, 234, 234));
        //绝对布局
        contentPane.setLayout(null);
        JButton button = new JButton("点击弹出一个对话框");
        button.setBounds(50,50,200,50);

        //点击这个按钮的时候弹出一个弹窗
        button.addActionListener(new ActionListener() {//监听器
            @Override
            public void actionPerformed(ActionEvent e) {
                //弹窗
                new MyDialog();
            }
        });

        contentPane.add(button);

    }

    public static void main(String[] args) {
       new TestDialog();
    }
}
//弹窗的窗口
class MyDialog extends JDialog{
    public MyDialog() {
        setVisible(true);
        setBounds(500,500,400,300);
      // 弹窗默认是可以关闭的 setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container contentPane = this.getContentPane();
        contentPane.setLayout(null);
        contentPane.add(new JLabel("欢迎学习Dialog!"));

    }
}