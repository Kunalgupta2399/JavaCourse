package com.kunal;

import java.util.Scanner;

public class arrrayModified {


    //get an array as input
    //print the array as before
    //get a search element as input
    //get a modifyTo element as input
    //search for the search element and change that to the modifyTo element
    //print the array as after

    private static final int SIZE = 5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[SIZE];
        for(int i = 0 ; i < SIZE ; i++){
            System.out.println("Enter yor number:" + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array As Before");
        for (int i = 0 ; i < SIZE ; i ++){
            System.out.println(arr[i]);
        }
        int search;
        int modify;
        System.out.println("Enter your search element");
        search = scanner.nextInt();
        System.out.println("Enter your element to be modified");
        modify = scanner.nextInt();


        for(int i = 0 ; i < SIZE ; i++){
            if(arr[i] == search){
                arr[i] = modify;
            }
        }

        for ( int i = 0 ; i < SIZE ; i++){
            System.out.println("Array as after " + arr[i]);
        }

    }
}
