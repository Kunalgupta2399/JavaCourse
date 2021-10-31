package com.kunal;

public class Triangle extends Shape{
    int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double area() {
        double s = (a + b + c) / 2;

        double area = Math.sqrt((s - a)*(s - b)*(s - c));
        System.out.println("triangle");
        return area;
    }

    @Override
    double perimeter() {
        return a + b + c;
    }
}
