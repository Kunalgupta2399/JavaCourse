package com.kunal;

import java.util.Scanner;

public class DuplicateValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your size");
        final int SIZE = scanner.nextInt();
        int[] array = new int[SIZE];

        System.out.println("Enter your array");
        for (int i = 0 ; i < SIZE ; i++){
            array[i] = scanner.nextInt();
        }

        for (int i = 0 ; i < SIZE ; i++){
            if (array[i] == array[i]){
                System.out.println(array[i]);
            }
        }
    }
}
