package ch.fhnw.housedemo;

import java.awt.geom.*;

public class Circle extends Element {

    public Circle() {
        size = 68;
        xPosition = 230;
        yPosition = 90;
        color = "blue";
    }

    protected void draw() {
        draw(new Ellipse2D.Double(xPosition, yPosition, size, size));
    }
}
