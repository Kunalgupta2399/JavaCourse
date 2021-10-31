package com.kunal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = {1 ,2 ,3 , 4 , 5};

        print(array);

        System.out.println("Enter the element you want ");
        int element = scanner.nextInt();

        array = insertarraylast(array , element);

        print(array);
    }

    private static int[] insertarraylast(int[] array, int element) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0 ; i < array.length ; i++){
            newArray[i] = array[i];
        }


        newArray[array.length] = element;
        return newArray;
    }

    private static void print(int[] array) {
        for (int i = 0 ; i < array.length ; i++){
            System.out.println( i + "==" + array[i]);
        }
    }
}
