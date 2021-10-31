package com.kunal;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[]array1 = new int[size];
        int[]array2 = new int[size];

        for (int i = 0 ; i < size ; i++){
            System.out.println("Enter Your input :" + i);
            array1[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < size ; i++){
            array2[i] =array1[i];
        }


        System.out.println("Array1");

        for (int i = 0 ; i < size ; i++){
            System.out.println(array1[i]);
        }


        System.out.println("Array2");

        for (int i = 0 ; i < size ; i++){
            System.out.println(array2[i]);
        }
    }
}
