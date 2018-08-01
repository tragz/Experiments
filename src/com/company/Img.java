package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Img {

    String fileName;
    PolygonDimension dimension;
    BufferedImage img;
    Color color;

    public Img(String fileName) {
        this.fileName = fileName;
        try {
            img = ImageIO.read(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.color = Color.RED;
    }

    public void setDimensions(int x, int y, int height, int width) {
        dimension = new PolygonDimension(x, y, height, width);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void drawRectangle() {
        Graphics2D g2d = img.createGraphics();
        g2d.setColor(color);
        g2d.drawRect(dimension.x, dimension.y, dimension.height, dimension.width);
        try {
            ImageIO.write(img, "jpg", new File("text.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        g2d.dispose();
    }
}
