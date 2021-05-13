package com.mf.Snake;

import javax.swing.*;
import java.awt.*;

/**
 * @author mf
 * @create 2021-05-12-20:19
 */
//游戏的主启动类
public class StartGame extends JFrame {

    public StartGame() {
        Container contentPane = getContentPane();

        setBounds(400,200,900,720);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //正常的游戏界面都应该在面板上
        this.add(new GamePanel());

    }

    public static void main(String[] args) {
        new StartGame();
    }
}
