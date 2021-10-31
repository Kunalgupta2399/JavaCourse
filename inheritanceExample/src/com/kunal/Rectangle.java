package com.kunal;

public class Rectangle extends Shape{
    protected int angle;
    protected int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void print(){
        System.out.println("This is Rectangular shape");
    }

    @Override
    double area() {
        System.out.println("rectangle");
        return length * breadth;
    }

    @Override
    double perimeter() {
        return 2 * (length + breadth);
    }
}
