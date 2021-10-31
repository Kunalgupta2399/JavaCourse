package com.kunal;

import java.util.Scanner;

public class Student {
    private String name ;
    private int rollNumber;
    private int fees;

    public Student(String name, int rollNumber, int fees) {
        System.out.println("Parameterised Constructor");
        this.name = name;
        this.rollNumber = rollNumber;
        this.fees = fees;
    }

    public Student(Student student) {
        System.out.println("Copy Constructor");
        this.name = student.name;
        this.rollNumber = student.rollNumber;
        this.fees = student.fees;

    }

    public Student() {
        System.out.println("Blank Constructor");
    }

    public void set(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name");
//        sc.nextLine();
        name = sc.nextLine();
        System.out.println("Enter your rollNumber");
        rollNumber = sc.nextInt();
        System.out.println("Enter your fees");
        fees = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", fees=" + fees +
                '}';
    }
}
