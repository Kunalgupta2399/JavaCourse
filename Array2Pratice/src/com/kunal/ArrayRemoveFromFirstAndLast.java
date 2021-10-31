package com.kunal;

import java.util.Scanner;

public class ArrayRemoveFromFirstAndLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1,2,3,4,5,6};

        printArray(array);

        array = removeFromLast(array);
        System.out.println("New Array");
//        array = removeFromFirst(array);
//        System.out.println("New array");

        printArray(array);

    }

    private static int[] removeFromFirst(int[] array) {
        int []newArray = new int[array.length-1];
        for (int i = 1; i < array.length; i++) {
            newArray[i-1] = array[i];
        }
        return newArray;
    }

    private static int[] removeFromLast(int[] array) {
        int[] newArray = new int[array.length-1];
        for (int i = 0; i < array.length-1; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i +"--"+ array[i]);
        }
    }
}
