package com.kunal;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayInsertLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declare the array
        int[] array = {1, 2, 3, 4, 5, 6};

        printArray(array);
        ArrayList<Integer> temp = new ArrayList<>();

        temp.add(9);

        //get the element
        System.out.println("Enter new element : ");
        int element = scanner.nextInt();

        //call the insert last and update the array
        array = insertLast(array, element);

        printArray(array);
    }

    private static int[] insertLast(int[] array, int element) {
        int[] newArray = new int[array.length + 1];

        for(int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[array.length] = element;

        return newArray;
    }

    private static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(i + " -- " + array[i]);
        }
    }
}
