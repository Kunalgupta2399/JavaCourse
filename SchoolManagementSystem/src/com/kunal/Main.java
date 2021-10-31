package com.kunal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // menu driven code
        // add new student in the student array
        // search the student
        // remove the student
        // show detail of every student
        // quit

        Scanner scanner = new Scanner(System.in);
        int choice;
        Student[] studentList = new Student[0];
        Student student;
        int size = 0;

        // variable we may use
        String name;
        int rollNumber;
        Marks marks;
        Address address;

        do {
            menu();
            System.out.println("Enter Choice");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter name : ");
                    name = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Enter roll number : ");
                    rollNumber = scanner.nextInt();
                    System.out.println("Enter marks : ");
                    marks = new Marks();
                    marks.getMarks();
                    System.out.println("Enter address : ");
                    address = new Address();
                    address.getAddress();

                    student = new Student(name, rollNumber, marks, address);
                    studentList = addStudent(studentList, student);
                    System.out.println(student.getName() + " added to the list.");
                    break;


                case 2:
                    System.out.println("Enter roll number : ");
                    rollNumber = scanner.nextInt();
                    student = searchStudent(studentList, rollNumber);
                    if (student != null) {
                        System.out.println(student);
                        student.printGrade();
                    } else {
                        System.out.println("student not found");
                    }
                    break;


                case 3:
                    System.out.println("Enter roll number : ");
                    rollNumber = scanner.nextInt();
                    studentList = removeStudent(studentList, rollNumber);
                    System.out.println("student removed");
                    break;


                case 4:
                    printStudentList(studentList);
                    break;

                case 5:
                    System.out.println("quitting !!");
                    break;

                default:
                    System.out.println("Invalid response");
                    break;
            }

        } while (choice != 5);
    }

    private static void printStudentList(Student[] studentList) {
        for(Student student : studentList) {
            System.out.println(student);
        }
    }

    private static Student[] removeStudent(Student[] studentList, int rollNumber) {
        int index = -1;

        for (int i = 0; i < studentList.length; i++) {
            if(studentList[i].getRollNumber() == rollNumber) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            return studentList;
        } else {
            Student [] newStudentList = new Student[studentList.length - 1];

            for (int i = 0; i < index; i++) {
                newStudentList[i] = studentList[i];
            }

            for (int i = index; i < newStudentList.length; i++) {
                newStudentList[i] = studentList[i + 1];
            }
            return newStudentList;
        }
    }

    private static Student searchStudent(Student[] studentList, int rollNumber) {
        for (int i = 0; i < studentList.length; i++) {
            if(studentList[i].getRollNumber() == rollNumber) {
                return studentList[i];
            }
        }
        return null;
    }

    private static Student[] addStudent(Student[] studentList, Student student) {
        Student[] newStudentList = new Student[studentList.length + 1];

        for (int i = 0; i < studentList.length; i++) {
            newStudentList[i] = studentList[i];
        }

        newStudentList[studentList.length] = student;
        return newStudentList;
    }

    private static void menu() {
        System.out.println("<=======MENU=======>");
        System.out.println("1. insert");
        System.out.println("2. search");
        System.out.println("3. remove");
        System.out.println("4. print ");;
        System.out.println("5. quit");
    }
}
