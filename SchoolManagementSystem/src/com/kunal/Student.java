package com.kunal;

import java.util.Scanner;

//POJO - plain old java object
public class Student {

    private String name;
    private int rollNumber;
    private Marks marks;
    private Address address; //address is a complex data type hence used the concept of COMPOSITION

    public Student(String name, int rollNumber, Marks marks, Address address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", marks=" + marks +
                ", address=" + address +
                '}';
    }

    public void printGrade() {
        float totalMarks = this.marks.totalMarks();
        char grade;

        if(totalMarks <= 40) {
            grade = 'F';
        } else if (totalMarks <= 60) {
            grade = 'C';
        } else if (totalMarks <= 80) {
            grade = 'B';
        } else if (totalMarks <= 100) {
            grade = 'A';
        } else {
            grade = '*';
            System.out.println("invalid total marks");
        }

        System.out.println("grade = " + grade);
    }
}
