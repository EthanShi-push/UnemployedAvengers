package com.example.unemployedavengers;

public abstract class Shape {
    protected int x;
    protected int y;
    protected String color = "$PUT_YOUR_CHOICE_OF_COLOR";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Abstract method to be implemented by subclasses
    public abstract double getArea();

    // Getter and Setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Shape at (" + x + ", " + y + ") with color: " + color);
    }
}
