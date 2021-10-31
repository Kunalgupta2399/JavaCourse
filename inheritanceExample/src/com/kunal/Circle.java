package com.kunal;

public class Circle extends Shape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void print(){
        System.out.println("This is Circular Shape");
    }

    @Override
    double area() {
        System.out.println("Circle");
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}
