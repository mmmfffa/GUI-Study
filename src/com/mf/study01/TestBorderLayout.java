package com.mf.study01;

import javax.xml.stream.FactoryConfigurationError;
import java.awt.*;

/**
 * @author mf
 * @create 2021-05-11-19:49
 */
public class TestBorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("TestBorderLayout");

        Button east = new Button("east");
        Button west = new Button("west");
        Button south = new Button("south");
        Button north = new Button("north");
        Button center = new Button("center");

        frame.add(east,BorderLayout.EAST);
        frame.add(west,BorderLayout.WEST);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(north,BorderLayout.NORTH);
        frame.add(center,BorderLayout.CENTER);

        frame.setBounds(400,400,400,400);
        frame.setBackground(Color.red);
        frame.setVisible(true);



    }


}
