package com.kunal;

import java.util.Scanner;

public class ArrayInsertAtSpecificIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5, 6, 7};

        printArray(array);

        System.out.println("Enter your element ");
        int element = scanner.nextInt();

        System.out.println("Enter index at which you want to enter your element");
        int index = scanner.nextInt();


        array = insertAtSpecificIndex(array, element, index);

        printArray(array);

    }

    private static int[] insertAtSpecificIndex(int[] array, int element, int index) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        newArray[index] = element;
        return newArray;
    }


    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+"--"+array[i]);
        }
    }
}
