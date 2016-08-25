package ch.fhnw.housedemo;

import java.awt.*;

public class Triangle extends Element {

    private int height;
    private int width;

    public Triangle() {
        height = 60;
        width = 70;
        xPosition = 210;
        yPosition = 140;
        color = "green";
    }

    @Override
    public void changeSize(int newSize) {
        changeSize(newSize, newSize);
    }

    public void changeSize(int newHeight, int newWidth) {
        erase();
        height = newHeight;
        width = newWidth;
        draw();
    }

    @Override
    protected void draw() {
        int[] xpoints = {xPosition, xPosition + (width / 2), xPosition - (width / 2)};
        int[] ypoints = {yPosition, yPosition + height, yPosition + height};
        draw(new Polygon(xpoints, ypoints, 3));
    }
}
