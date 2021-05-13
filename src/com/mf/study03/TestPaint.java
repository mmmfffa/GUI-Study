package com.mf.study03;

import com.mf.study03.uitls.windowsClose;

import java.awt.*;

/**
 * @author mf
 * @create 2021-05-11-22:06
 */
public class TestPaint {
    public static void main(String[] args) {
       new MyPaint().loadFrame();
    }
}
class MyPaint extends Frame{

    public void loadFrame(){
        setBounds(400,400,800,800);
        setVisible(true);
        new windowsClose().close(this);
    }

    @Override
    public void paint(Graphics g) {
         //画笔需要有颜色
        g.setColor(Color.RED);
//        g.drawOval(100,100,200,200);
        g.fillOval(100,100,200,200);//实心

        g.setColor(Color.green);
        g.fillRect(200,300,400,200);
    }
}