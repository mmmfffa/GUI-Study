package com.mf.study04;

import sun.net.www.content.image.jpeg;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author mf
 * @create 2021-05-12-16:53
 */
public class TestImageIcon extends JFrame {
    public TestImageIcon(){
        //获取图片的地址：最快的方式是通过类的所在路径获取
        JLabel jLabel = new JLabel("ImageIcon");
        URL url= TestImageIcon.class.getResource("3.jpeg");
        ImageIcon imageIcon = new ImageIcon(url);
        jLabel.setIcon(imageIcon);
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        Container contentPane = getContentPane();
        contentPane.add(jLabel);

        setVisible(true);
        setBounds(200,200,400,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
       new TestImageIcon();
    }
}
