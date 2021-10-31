package com.kunal;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Hemis {
    private int radius;


    public double TSA(){
    return 3 * PI * Math.pow(this.radius , 2);
    }
    public double CSA(){
        return 2 * PI * Math.pow(this.radius , 2);
    }
    public double Volume(){
        return  0.666 * PI * Math.pow(this.radius , 3);
    }


    public void set (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Radius");
        this.radius = scanner.nextInt();
    }
    public void show(){
        System.out.println("Your TSA is" +(TSA()));
        System.out.println("Yous CSA is " + (CSA()));
        System.out.println("Your Volume is " + (Volume()));
    }
}
