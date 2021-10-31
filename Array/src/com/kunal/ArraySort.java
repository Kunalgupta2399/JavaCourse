package com.kunal;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Array Size");
        int n = scanner.nextInt();
        int[] array = inputArray(n);

//         (array);
//        insertionSort(array);
//        bubbleSort(array);
//        bubbleSort2(array);
        Arrays.sort(array);
        printArray(array);
}

    private static void bubbleSort2(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length-1 ; j++) {
                if (array[j+1] < array[j] ){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    private static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int current = array[i];

            while(j >= 0 && array[j] > current) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {

            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

        }
    }

    private static void printArray(int[] array) {
        System.out.println("----------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("\n----------");
    }

    private static int[] inputArray(int n) {
        Scanner scanner =new Scanner(System.in);
        int [] array = new int[n];
        System.out.println("Enter your elements");
        for (int i = 0; i < array.length ; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
