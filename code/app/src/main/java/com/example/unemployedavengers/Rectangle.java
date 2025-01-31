package com.example.unemployedavengers;

public class Rectangle extends Shape {

    public Rectangle(int x, int y) {
        super(x, y);
        this.color = "Green";
    }

    @Override
    public double getArea() {
        return x*y;
    }
}
