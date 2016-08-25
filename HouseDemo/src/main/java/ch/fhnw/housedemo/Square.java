package ch.fhnw.housedemo;

import java.awt.*;

public class Square extends Element {

    public Square() {
        size = 60;
        xPosition = 310;
        yPosition = 120;
        color = "red";
    }

    @Override
    protected void draw() {
        draw(new Rectangle(xPosition, yPosition, size, size));
    }
}
