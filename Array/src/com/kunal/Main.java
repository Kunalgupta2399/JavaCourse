package com.kunal;

import java.util.Scanner;

public class Main {
    public static final int SIZE = 5;

    public static void main(String[] args) {
        int[] input = new int[SIZE];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your numbers : ");
        for(int i = 0; i < SIZE; i++) {
            System.out.println("Number " + i + " : ");
            input[i] = scanner.nextInt();
        }


        System.out.println("Output : ");
        int sum = 0;
        for(int i = 0; i < SIZE; i++) {
//            System.out.println("Number " + i + " : " + factorial(input[i]));
            sum = sum + input[i];
        }
        System.out.println(sum/SIZE);
    }

    public static int factorial(int number){
        int fact = 1;
        for (int i = 1 ; i <= number ; i++ ){
            fact = fact * i;
        }
        return fact;
    }
}
