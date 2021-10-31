package com.kunal;

import java.util.Scanner;

public class ArrayInsertatfirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = { 1, 2, 3, 4 , 5 ,6};

        print(array);

        System.out.println("Enter your element to add on first place");
        int element = scanner.nextInt();

        array = insertatfirst(array , element);

        print( array);
    }

    private static int[] insertatfirst(int[] array, int element) {

        int[] newArray = new int[array.length + 1];

        for (int i = 0 ; i < array.length ; i++){
            newArray[ i + 1] = array[i];
        }
        newArray[0] = element;
        return newArray;
    }

    private static void print(int[] array) {
        for (int i = 0 ; i < array.length ; i++){
            System.out.println(i + "***" + array[i]);
        }
    }

}
