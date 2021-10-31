package com.kunal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape s1 = new Rectangle(5, 6);
        Shape s2 = new Circle(5);
        Shape s3 = new Square(3);
        Shape s4 = new Triangle(5, 6, 7);


        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(s3.area());
        System.out.println(s4.area());
    }





}
