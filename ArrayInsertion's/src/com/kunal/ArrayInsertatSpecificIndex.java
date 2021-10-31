package com.kunal;

import java.util.Scanner;

public class ArrayInsertatSpecificIndex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5, 6};

        print(array);

        System.out.println("Enter Your Element");
        int element = scanner.nextInt();


        int index = 0;
        System.out.println("Enter Your index");
        index = scanner.nextInt();
        if (index < array.length) {
            array = insertArrayatSpecificIndex(array ,element , index);
        }

        print(array);

    }

    private static int[] insertArrayatSpecificIndex(int[] array, int element, int index) {
        int[] newArray = new int[array.length +1];
        for(int i = 0 ; i < array.length ; i++){
            newArray[i] = array[i];
        }
        for (int i = 0 ; i < array.length ; i++){
            newArray[i +1] = array[i];
        }
        newArray[index] = element;
        return newArray;
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "=" + array[i]);
        }
    }
}


