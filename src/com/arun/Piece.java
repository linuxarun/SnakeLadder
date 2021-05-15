package com.arun;

public class Piece {
    private String color;
    private Box box;

    public Piece(Box box, String color) {
        this.box = box;
        this.color = color;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "color='" + color + '\'' +
                ", box=" + box +
                '}';
    }
}
