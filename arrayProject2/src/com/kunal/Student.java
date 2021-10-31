package com.kunal;


//create a class Student with rollNumber, standard, name, Marks(array of 5 subjects)
//setDetails
//showDetails
//calculateGrade
//calculateAverage


import java.util.Scanner;

public class Student {
    private final int SUBJECTS = 5;
    private int rollnuber;
    private int[] marks;
    private String names;
    private int standrad;

    public Student() {
        this.marks = new int[SUBJECTS];
    }

    public void set() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your RollNumber");
        rollnuber = scanner.nextInt();
        System.out.println("Enter Your Name");
        names = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter Your marks");
        for (int i = 0 ; i<SUBJECTS ; i++){
            marks[i] = scanner.nextInt();
        }
        System.out.println("Enter Your Standard");
        standrad = scanner.nextInt();
    }

    public void show(){
        System.out.println(this.names);
        System.out.println(this.rollnuber);
        System.out.println("marks");
        for (int i = 0 ; i < SUBJECTS ; i++){
            System.out.println(marks[i]);
        }
        System.out.println(this.standrad);
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

