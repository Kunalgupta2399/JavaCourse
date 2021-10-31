package com.kunal;

import java.util.Scanner;

public class findIndexinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 3;
        int[] index = new int[SIZE];
        int search= 0;


        for (int i = 0; i < SIZE; i++) {
            System.out.println("Enter You Input" + i);
            index[i] = scanner.nextInt();
        }


        System.out.println("Enter element to searched");
        search = scanner.nextInt();

        for (int i = 0 ; i <SIZE ; i++){
            if(index[i] == search ){
                System.out.println("Index Found at " + search);
            }else{
                System.out.println("Not found");
            }
        }


    }
}


