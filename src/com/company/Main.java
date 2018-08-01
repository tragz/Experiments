package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Img img = new Img("/Users/raghav.tanaji/Desktop/ExP/AddRectangleToImage/src/com/company/VD.jpg");
        img.setDimensions(10, 20, 100, 100);
        img.setColor(Color.YELLOW);
        img.drawRectangle();

    }
}
