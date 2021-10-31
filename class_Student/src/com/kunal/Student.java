package com.kunal;

import java.util.Scanner;

public class Student {
    private String name;
    private int rollNumber;

    public void set(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name: ");
        this.name = scanner.next();
        System.out.println("enter roll number : ");
        this.rollNumber = scanner.nextInt();
    }

    public void show(){
        System.out.println("Your name is = " + " " + name);
        System.out.println("Your Roll Number is =" + " " + rollNumber);
        System.out.println("+++++++++++++++++++");
    }
}
