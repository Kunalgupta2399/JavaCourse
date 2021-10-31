package com.kunal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        System.out.println("*****");
//        System.out.println(" "+ " "+" "+ "*");
//        System.out.println(" " + " " + "*");
//        System.out.println(" "+ "*");
//        System.out.println("*****");

//        Scanner scn = new Scanner(System.in);
//        int marks = scn.nextInt();
//        if (marks >= 90) {
//            System.out.println("excellent");
//        } else if (marks >= 80) {
//            System.out.println("good");
//        } else if (marks >= 70) {
//            System.out.println("fair");
//        } else if (marks >= 60) {
//            System.out.println("meets expectations");
//        } else if (marks <= 60) {
//            System.out.println(" below par");
//        } else {
//            System.out.println("Padh le");
//        }
        int i = 10;
        if(i++ == i)
            System.out.println(i + " is good");
        else
            System.out.println(i + " is bad");

        int j = 20;
        if(++j == j)
            System.out.println(j + " is good");
        else
            System.out.println(j + " is bad");
    }
}

