package com.kunal;

import java.util.Scanner;

public class InsertBeforeAndAfter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5, 6};

        print(array);

        System.out.println("Enter the element at which you want");
        int element = scanner.nextInt();

        System.out.println("Enter the element you want");
        int newElement = scanner.nextInt();

//        array = insertBefore(array , element , newElement);
        array = insertAfter(array ,element, newElement);

        print(array);
    }

    private static int[] insertAfter(int[] array, int element, int newElement) {
        int[] newArray = new int[array.length + 1];

        int index = -1;
         for (int i = 0 ; i < array.length ; i++){
             if(array[i] == element){
                 index = i;
             }
         }
        index++;

         for (int i = 0 ; i < index ; i++){
             newArray[i] = array[i];
         }
         for (int i = index ; i < array.length ; i++){
             newArray[ i +1] = array[i];
         }
         newArray[index] = newElement;
         return newArray;
    }

    private static int[] insertBefore(int[] array, int element, int newElement) {
        int[] newArray = new int[array.length + 1];

        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
            }
        }

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        newArray[index] = newElement;
        return newArray;
    }

    private static void print(int[] array) {
        for (int i = 0 ; i < array.length ; i++){
            System.out.println(i + " "+ "*--*" + " " + array[i]);
        }
    }


}
