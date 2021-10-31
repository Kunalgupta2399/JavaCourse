package com.kunal;

import java.util.Arrays;
import java.util.Scanner;

public class Students {
    private final int SUBJECTS = 5;
    private String name;
    private int rollnumber;
    private int standard;
    private int[] marks;


    public Students() {
        this.marks = new int[SUBJECTS];
    }

    public void set() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter You name");
        name = scanner.nextLine();
        System.out.println("Enter your rollnumber");
        rollnumber = scanner.nextInt();
        System.out.println("Enter your marks");
        for (int i = 0; i < SUBJECTS; i++) {
            marks[i] = scanner.nextInt();
        }
        System.out.println("Enter your standard");
        standard = scanner.nextInt();
    }


    public void show() {
        System.out.println(this.name);
        System.out.println(this.standard);
        System.out.println("marks");
        for (int i = 0; i < SUBJECTS; i++) {
            System.out.println(marks[i]);
        }
        System.out.println(this.rollnumber);
        System.out.println(this.calculateAverage());
        System.out.println(this.calculateGrade());
    }


    private float calculateAverage() {
        int sum = 0;
        for (int i = 0; i < SUBJECTS; i++) {
            sum = sum + marks[i];
        }
        return sum / SUBJECTS;
    }

    private String calculateGrade(){
        float average = calculateAverage();

        if(average >= 80){
            return "A";
        }else if (average >= 60){
            return "B";
        }else if(average >= 40){
            return "C";
        }else {
            return "fail";
        }
    }

}
