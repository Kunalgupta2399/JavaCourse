package com.kunal;

public class Triangle {
    private double a;
    private double b;
    private double c;



    private double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
    private double perimeter() {
        return a + b + c;
    }

    public void set_sides(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void show() {
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("side 1 = " + a);
        System.out.println("side 2 = " + b);
        System.out.println("side 3 = " + c);
        System.out.println("area = " + area());
        System.out.println("perimeter = " + perimeter());
        System.out.println("+++++++++++++++++++++++++++++");
    }

}
