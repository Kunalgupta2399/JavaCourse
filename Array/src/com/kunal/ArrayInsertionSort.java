package com.kunal;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class ArrayInsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Array size");
        int n= scanner.nextInt();
        int [] array = inputArray(n);
        printArray(array);
        insertionSort(array);
        printArray(array);

    }

    private static void insertionSort(int[] array) {
        //Same code but some error
        //        for (int i = 1; i < array.length ; i++) {
//            int temp = array[i];
//            int j = i - 1;
//            while(j >= 0 && array[i] >temp){
//                array[j+1]= array[j];
//                j--;
//            }
//            array[j+1] =temp;
//        }
        //Same code but some error



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

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+"--"+ array[i]);
        }
        System.out.println("=-=-=-=-=-=-=-");
    }

    private static int[] inputArray(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[n];
        System.out.println("Enter your array");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
