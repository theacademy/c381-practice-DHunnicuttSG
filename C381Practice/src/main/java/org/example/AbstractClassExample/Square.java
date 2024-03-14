package org.example.AbstractClassExample;

public class Square extends Shape {
    private double height;
    private double width;

    public Square() {
        this.height = 2;
        this.width = 2;
    }

    public Square (double height, double width) {
        this.height = height;
        this.width = width;
    }


    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
