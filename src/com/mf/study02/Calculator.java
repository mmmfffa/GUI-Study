package com.mf.study02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author mf
 * @create 2021-05-11-21:30
 */
//简易计算器
public class Calculator {
    public static void main(String[] args) {
        new Calc().loadFrame();
    }
}
class Calc extends Frame{
    //属性
    TextField num1;
    TextField num2;
    TextField num3;
    //方法
    public void loadFrame(){
        //3个文本框
        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(20);

        //1个按钮
        Button button = new Button("=");
        button.addActionListener(new MyCalcListener());
        //1个标签
        Label label = new Label("+");

        //布局
        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);
        pack();
        setVisible(true);
    }

    //监听器类
     private class MyCalcListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //做加法
            //或的加数和被加数
            int n1=Integer.parseInt(num1.getText());
            int n2=Integer.parseInt(num2.getText());

            //将这个值+法运算，放到第三个框
            num3.setText(""+(n1+n2));
            //清除前两个框
            num1.setText("");
            num2.setText("");
        }
    }
}
