package com.kunal;

import java.util.Scanner;

public class InsertAtSpecificIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5, 6};
        print(array);

        System.out.println("Enter Your element");
        int element = scanner.nextInt();

        System.out.println("Enter your Index");
        int index = scanner.nextInt();

        array = InsertAtSpecific(array, index, element);

        print(array);
    }

    private static int[] InsertAtSpecific(int[] array, int index, int element) {
        int[] newArray = new int[array.length +1];
        for (int i = 0 ; i < index ; i++){
            newArray[i] =array[i];
        }
        for (int i = index ; i < array.length ; i++){
            newArray[i + 1] = array[i];
        }
        newArray[index] = element;
        return newArray;
    }

    private static void print(int[] array) {
        for (int i = 0 ; i < array.length ; i++){
            System.out.println(i +" *--*" + array[i]);
        }
    }


}
