
package com.company;

import java.util.Scanner;

public class Rectangle {
    private int length;
    private int breadth;

    private int area(){
        return length * breadth;
    }
    private int setDim(){
        return 2*( length + breadth);
    }

    public void getting_other_side(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your length :");
        this.length = scanner.nextInt();
        System.out.println("Enter your breadth :");
        this.breadth = scanner.nextInt();
    }
    public void show(){
        System.out.println("Length =" + " " + length);
        System.out.println("Breadth = " + " " + breadth);
        System.out.println("Area of Rectangle is =" + " " + area());
        System.out.println("Perimeter of Rectangle is =" + " "+ setDim());
        System.out.println("+++++++++++++++++++++++");
    }
}
