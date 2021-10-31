package com.kunal;

import java.util.Scanner;

public class InsertAtFirst {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1,2,3,4,5,6};

        print(array);

        System.out.println("Enter your new input");
        int element = scanner.nextInt();

        array =  insertfirst(array , element);

        print(array);
    }

    private static int[] insertfirst(int[] array, int element) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0 ; i < array.length ; i++){
            newArray[i + 1] = array[i];
        }
        newArray[0] = element;
        return newArray;
    }

    private static void print(int[] array) {
        for (int i = 0 ; i < array.length ; i++){
            System.out.println(i + " -- " + array[i]);
        }
    }
}
