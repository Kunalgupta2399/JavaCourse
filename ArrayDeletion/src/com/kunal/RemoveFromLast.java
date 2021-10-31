package com.kunal;

import java.util.Scanner;

public class RemoveFromLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6};

        print(array);

        array = removeLast(array);

        print(array);


    }



    private static int[] removeLast(int[] array) {
        int[] newArray = new int[array.length - 1];


        for (int i = 0; i < array.length - 1; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }


    private static void print(int[] array) {
        for (int i = 0 ; i < array.length ; i++){
            System.out.println(i + "*-*-*" + array[i]);
        }

    }
}
