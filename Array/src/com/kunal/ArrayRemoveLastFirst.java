package com.kunal;

import java.util.Scanner;

public class ArrayRemoveLastFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declare the array
        int[] array = {1, 2, 3, 4, 5, 6};

        printArray(array);

        //get the element
//        System.out.println("Enter new element : ");-
//        int element = scanner.nextInt();

//        call the insert last and update the array
          array = removeLast(array);
//        array = removeFirst(array);

        printArray(array);
    }

///   private static int[] removeFirst(int[] array) {
//        int [] newArray = new int[array.length - 1];
//
//        for (int i = 1; i < array.length; i++) {
//            newArray[i - 1] = array[i];
//        }
//
//        return newArray;
//    }

    private static int[] removeLast(int[] array) {
        int [] newArray = new int[array.length - 1];

        for (int i = 0; i < array.length - 1; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(i + " -- " + array[i]);
        }
    }
}
