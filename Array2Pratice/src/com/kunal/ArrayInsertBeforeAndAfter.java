package com.kunal;

import java.util.Scanner;

public class ArrayInsertBeforeAndAfter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] array = {1 , 2, 3 , 4 , 5, 6, 7};
        
        printArray(array);

        System.out.println("Enter element after which you want to insert");
        int element = scanner.nextInt();


        System.out.println("Enter your new element");
        int newElement = scanner.nextInt();

        array = insertBeforeArray(array , element , newElement);
        array = insertAfterArray(array , element, newElement);
        
        printArray(array);
        
    }

    private static int[] insertBeforeArray(int[] array, int element, int newElement) {
        int [] newArray = new int[array.length + 1];
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element){
                index = i;
            }
        }
        for (int i = 0; i <index ; i++) {
            newArray[i] = array[i];
        }
        for (int i = index; i < array.length ; i++) {
            newArray[i+1] = array[i];
        }
        newArray[index] = newElement;
        return  newArray;
    }

    private static int[] insertAfterArray(int[] array, int element, int newElement) {
        int[] newArray = new int[array.length+1];
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == element){
                index = i;
            }

        }
        index++;
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index; i < array.length ; i++) {
            newArray[i+1] = array[i];
        }
        newArray[index] = newElement;
        return newArray;

    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i +"--"+array[i]);
        }
    }

}
