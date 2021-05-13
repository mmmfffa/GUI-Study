package com.mf.study02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author mf
 * @create 2021-05-11-21:05
 */
public class TestActionEvent02 {
    public static void main(String[] args) {
        //两个按钮实现同一个监听
        //开始，停止
        Frame frame = new Frame();
        Button start = new Button("start");
        Button stop = new Button("stop");
        stop.setActionCommand("stop-btn");//可以显示定义触发返回命令
        //可以只写一个button事件监听按钮
        MyMonitor myMonitor = new MyMonitor();
        start.addActionListener(myMonitor);
        stop.addActionListener(myMonitor);
        frame.add(start,BorderLayout.WEST);
        frame.add(stop,BorderLayout.EAST);
        frame.pack();
        frame.setVisible(true);


    }
}
class  MyMonitor implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        //e.getActionCommand()获得按钮的信息
          System.out.println("按钮被点击了=>"+e.getActionCommand());
    }
}
