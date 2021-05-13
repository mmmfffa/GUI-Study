package com.mf.study05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author mf
 * @create 2021-05-12-19:24
 */
public class TestButton extends JFrame {
    public TestButton(){
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        URL resource = TestButton.class.getResource("3.jpeg");
        ImageIcon imageIcon = new ImageIcon(resource);

        //将图标放在按钮上
        JButton button = new JButton();
        button.setIcon(imageIcon);
        button.setToolTipText("皮卡丘");//提示文本

        JPanel jPanel = new JPanel();
        jPanel.add(button);
        contentPane.add(jPanel,BorderLayout.CENTER);
        setVisible(true);
        setBounds(200,200,400,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new TestButton();
    }
}
