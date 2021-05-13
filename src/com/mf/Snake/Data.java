package com.mf.Snake;

import javax.swing.*;
import java.net.URL;

/**
 * @author mf
 * @create 2021-05-12-20:53
 */
//数据中心
public class Data {
    public static URL bodyURl=Data.class.getResource("/statics/body.png");
    public static ImageIcon body=new ImageIcon(bodyURl);
    public static URL downURl=Data.class.getResource("/statics/down.png");
    public static ImageIcon down=new ImageIcon(downURl);
    public static URL foodURl=Data.class.getResource("/statics/food.png");
    public static ImageIcon food=new ImageIcon(foodURl);
    public static URL headerURl=Data.class.getResource("/statics/header.png");
    public static ImageIcon header=new ImageIcon(headerURl);
    public static URL leftURl=Data.class.getResource("/statics/left.png");
    public static ImageIcon left=new ImageIcon(leftURl);
    public static URL rightURl=Data.class.getResource("/statics/right.png");
    public static ImageIcon right=new ImageIcon(rightURl);
    public static URL upURl=Data.class.getResource("/statics/up.png");
    public static ImageIcon up=new ImageIcon(upURl);
}
