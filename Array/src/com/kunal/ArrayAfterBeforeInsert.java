package com.kunal;

import java.util.Scanner;

public class ArrayAfterBeforeInsert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declare the array
        int[] array = {1, 2, 3, 4, 5, 6};

        printArray(array);

        //get the element
        System.out.println("Enter the element after which you want to insert: ");
        int element = scanner.nextInt();

        System.out.println("Enter new element : ");
        int newElement = scanner.nextInt();

        //call the insert last and update the array
//      array = insertAfter(array, element, newElement);
        array = insertBefore(array, element, newElement);

        printArray(array);
    }

    private static int[] insertBefore(int[] array, int element, int newElement) {
        int[] newArray = new int[array.length + 1];

        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
            }
        }

//        index++; // for after case for before case we do not update it

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        newArray[index] = newElement;
        return newArray;
    }

    private static int[] insertAfter(int[] array, int element, int newElement) {
        int[] newArray = new int[array.length + 1];

        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
            }
        }

        index++; // for after case for before case we do not update it

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        newArray[index] = newElement;
        return newArray;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " -- " + array[i]);
        }
    }
}
