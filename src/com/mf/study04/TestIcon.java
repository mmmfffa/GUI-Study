package com.mf.study04;

import javax.swing.*;
import java.awt.*;

/**
 * @author mf
 * @create 2021-05-12-16:38
 */
//图标是一个接口，需要实现类，Frame继承
public class TestIcon extends JFrame implements Icon {
    private int width;
    private int height;

    public TestIcon() {
    }

    public TestIcon(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void init(){


        this.setBounds(200,200,400,300);

        TestIcon testIcon = new TestIcon(80, 80);
        //图标可以放在标签上也可以放在按钮上
        JLabel jLabel = new JLabel("testIcon", testIcon, SwingConstants.CENTER);

        Container contentPane = this.getContentPane();
        contentPane.add(jLabel);
        contentPane.setBackground(Color.blue);

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new TestIcon().init();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
          g.setColor(Color.red);
          g.fillOval(x,y,width,height);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }
}
