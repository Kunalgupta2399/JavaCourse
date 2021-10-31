package com.kunal;

import java.util.Scanner;

public class AverageValueofArray {
    public static void main(String[] args) {
        final int size = 3;
        int[]numbers = new int[size];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0 ; i < size ; i++){
            System.out.println("Enter your number" + " " + i);
            numbers[i] = scanner.nextInt();
            sum = sum + numbers[i] ;
        }
        System.out.println("Average is " + " " + sum/size);
    }
}
