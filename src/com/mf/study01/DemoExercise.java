package com.mf.study01;

import java.awt.*;

/**
 * @author mf
 * @create 2021-05-11-20:29
 */
public class DemoExercise {
    public static void main(String[] args) {
        //总Frame窗
        Frame frame = new Frame();
        frame.setLayout(new GridLayout(2,1));
        frame.setBounds(400,400,700,700);
        frame.setBackground(Color.green);
        frame.setVisible(true);

        //4个面板
        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2, 1));
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2, 2));

        panel1.add(new Button("west-1"),BorderLayout.WEST);
        panel1.add(new Button("east-1"),BorderLayout.EAST);
        panel2.add(new Button("grid-1"));
        panel2.add(new Button("grid-2"));
        panel1.add(panel2,BorderLayout.CENTER);

        panel3.add(new Button("west-2"),BorderLayout.WEST);
        panel3.add(new Button("east-2"),BorderLayout.EAST);
        for (int i = 0; i < 4; i++) {
            panel4.add(new Button("gridFor-"+i));
        }
        panel3.add(panel4,BorderLayout.CENTER);

        frame.add(panel1);
        frame.add(panel3);


    }
}
