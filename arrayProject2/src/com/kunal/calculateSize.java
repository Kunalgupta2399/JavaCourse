package com.kunal;

import java.util.Scanner;

public class calculateSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Array Size");
       int SIZE =  scanner.nextInt();
        int[] arr = new int[SIZE];

        float sum = 0;

        for (int i = 0 ; i <SIZE ; i++){
            System.out.println("Enter Your Input :" +i);
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];
        }
        System.out.println(sum / SIZE);
    }
}
