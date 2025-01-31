package com.example.unemployedavengers;

import java.awt.Shape;

public class Circle extends Shape {
    public Circle(int x, int y) {
        super(x,y);
        this.color = "Red";
    }

    @Override
    public double getArea() {
        return 3.14 * (x/2);
    }
}
