package com.kunal;

import java.util.Scanner;

public class ArrayBubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Array Size");
        int n = scanner.nextInt();
        int [] array = inputArray(n);
        printArray(array);
        bubbleSort(array);
        printArray(array);

    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j]>array[j+1]){
                    int temp= array[j];
                    array[j] =array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+"--"+array[i]);
        }
        System.out.println("***********");
    }

    private static int[] inputArray(int n) {
        Scanner scanner =new Scanner(System.in);
        int[] array = new int[n];
        System.out.println("Enter your array");
        for (int i = 0; i < array.length ; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
