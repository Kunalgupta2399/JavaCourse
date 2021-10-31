package com.kunal;

import java.util.Scanner;

public class ArrayModify {

    //get an array as input
    //print the array as before
    //get a search element as input
    //get a modifyTo element as input
    //search for the search element and change that to the modifyTo element
    //print the array as after
    private static final int SIZE = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[SIZE];

        for (int i = 0 ; i < SIZE ; i++){
            System.out.println("Enter Your Number");
            arr[i] = scanner.nextInt();
        }


        System.out.println("Array as before");
        for (int i = 0 ; i < SIZE ; i++){
            System.out.println( "{" + arr[i] +"}");
        }

        int search;
        int modify;
        System.out.println("Enter Which element to modified");
        search = scanner.nextInt();
        System.out.println("Enter your input to modify");
        modify = scanner.nextInt();


        for (int i = 0 ; i < SIZE ; i ++){
            if(arr[i] == search){
                arr[i] = modify;
            }
        }

        System.out.println("Array as after");
        for (int i = 0 ; i < SIZE ; i++){
            System.out.println( "{" + arr[i] +"}");
        }
    }
}
