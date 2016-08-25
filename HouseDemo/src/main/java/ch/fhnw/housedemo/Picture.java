package ch.fhnw.housedemo;

public class Picture {

    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    public Picture() {
        wall = new Square();
        window = new Square();
        roof = new Triangle();
        sun = new Circle();
    }

    public void draw() {

        getWall().moveHorizontal(-140);
        getWall().moveVertical(20);
        getWall().changeSize(120);
        getWall().draw();

        getWindow().changeColor("black");
        getWindow().moveHorizontal(-120);
        getWindow().moveVertical(40);
        getWindow().changeSize(40);
        getWindow().draw();

        getRoof().changeSize(60, 180);
        getRoof().moveHorizontal(20);
        getRoof().moveVertical(-60);
        getRoof().draw();

        getSun().changeColor("yellow");
        getSun().moveHorizontal(100);
        getSun().moveVertical(-40);
        getSun().changeSize(80);
        getSun().draw();

    }

    public void setBlackAndWhite() {
        getWall().changeColor("black");
        getWindow().changeColor("white");
        getRoof().changeColor("black");
        getSun().changeColor("black");
    }

    public void setColor() {
        getWall().changeColor("red");
        getWindow().changeColor("black");
        getRoof().changeColor("green");
        getSun().changeColor("yellow");
    }

    public Square getWall() {
        return wall;
    }

    public Square getWindow() {
        return window;
    }

    public Triangle getRoof() {
        return roof;
    }

    public Circle getSun() {
        return sun;
    }
}
