package com.mf.study02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

/**
 * @author mf
 * @create 2021-05-11-21:17
 */
public class TextFieldListen {
    public static void main(String[] args) {
        //启动！
        new MyFrame();
    }
}
class MyFrame extends Frame{
    public MyFrame(){
        TextField textField = new TextField();
        add(textField);
        //监听这个文本框输入的文字
        //按下回车就会触发这个输入框的事件
        textField.addActionListener(new ActionListener2());
        pack();
        //设置替换编码
        textField.setEchoChar('*');
        setVisible(true);
    }
}
class ActionListener2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField textField=(TextField)e.getSource();//获得一些资源
        System.out.println(textField.getText());//获得输入框中文本
        textField.setText("");//再次回车清空内容
    }
}
