package ch.fhnw.housedemo;

import java.awt.Shape;

/**
 *
 * @author andreas.martin
 */
public abstract class Element {

    protected int size;
    protected int xPosition;
    protected int yPosition;
    protected String color;

    protected abstract void draw();

    protected void draw(Shape shape) {
        Canvas.getCanvas().draw(this, color, shape);
    }

    /**
     * Move the element a few pixels to the right.
     */
    public void moveRight() {
        moveHorizontal(20);
    }

    /**
     * Move the element a few pixels to the left.
     */
    public void moveLeft() {
        moveHorizontal(-20);
    }

    /**
     * Move the element a few pixels up.
     */
    public void moveUp() {
        moveVertical(-20);
    }

    /**
     * Move the element a few pixels down.
     */
    public void moveDown() {
        moveVertical(20);
    }

    /**
     * Move the element horizontally by 'distance' pixels.
     */
    public void moveHorizontal(int distance) {
        erase();
        xPosition += distance;
        draw();
    }

    /**
     * Move the element vertically by 'distance' pixels.
     */
    public void moveVertical(int distance) {
        erase();
        yPosition += distance;
        draw();
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void changeSize(int newSize) {
        erase();
        size = newSize;
        draw();
    }

    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    public void changeColor(String newColor) {
        color = newColor;
        draw();
    }

    /**
     * Erase the element on screen.
     */
    protected void erase() {
        Canvas canvas = Canvas.getCanvas();
        canvas.erase(this);
    }

}
