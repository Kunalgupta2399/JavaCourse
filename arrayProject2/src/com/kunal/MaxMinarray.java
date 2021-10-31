package com.kunal;

import java.util.Scanner;

public class MaxMinarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your SIZE");
        int size = scanner.nextInt();
        int[] array1 = new int[size];


        for (int i = 0 ; i < size  ; i++){
            array1[i] = scanner.nextInt();
        }

        System.out.println(givememax(array1, size));
        System.out.println(givememin(array1, size));

    }


    private static int givememax(int[] array, int size) {
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }

        return max;
    }

    private static int givememin(int[] array, int size) {
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (min > array[i]) {
                min = array[i];
            }

        }

        return min;


    }
}
