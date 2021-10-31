package com.kunal;

import java.util.Scanner;

public class RemoveFromFirst {

    public static void main(String[] args) {
	// write your code here
        int[] array = {1,2,3,4,5,6};
        Scanner scanner = new Scanner(System.in);

        Print(array);

        array= removeFromFirst(array);

        Print(array);
    }

    private static int[] removeFromFirst(int[] array) {
        int[] newArray = new int[array.length - 1];
        for (int i = 1 ; i < array.length ; i++){
            newArray[i -1] = array[i];
        }
        return newArray;
    }

    private static void Print(int[] array) {
        for (int i =  0 ; i < array.length ; i++){
            System.out.println(i + " " + "*--*" + " " + array[i]);
        }
    }
}
