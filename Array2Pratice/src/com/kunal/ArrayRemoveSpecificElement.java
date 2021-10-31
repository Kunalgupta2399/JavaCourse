package com.kunal;

import java.util.Scanner;

public class ArrayRemoveSpecificElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1,2,3,4,5,6,7};

        printArray(array);

        System.out.println("Enter the element you want to remove");
        int element = scanner.nextInt();

        array = removeElement(array , element);

        printArray(array);
    }

    private static int[] removeElement(int[] array, int element) {
        int index = -1;
        for (int i = 0; i < array.length ; i++) {
           if (array[i] == element){
               index = i;
               array  = removeFromIndex(array , index);
           }
        }
        return array;
    }

    private static int[] removeFromIndex(int[] array, int index) {
        int [] newArray = new int[array.length-1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index + 1; i < array.length; i++) {
            newArray[i-1] = array[i];
        }
        return newArray;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i +"--"+array[i]);
        }
    }
}
