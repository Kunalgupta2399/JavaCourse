package com.kunal;

import java.util.Scanner;


public class ConvertArray {

    //convert the given integer array in the following way
    //if the number is even then multiply the number with twice it's index
    //if the number is prime then add thrice the index to it
    //if the number is odd and composite then subtract index from them include (1 in this case)
    //print the array

    //example: array = {1, 2, 3, 4, 5, 6, 7, 8, 9}
    // output: {1, 4, 9, 24, 17, 60, 25, 112, 1}

    public static void main(String[] args) {
        final int SIZE = 9;
        int[] arr = new int[SIZE];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < SIZE; i++) {
            System.out.println("Enter Your Number :" + i);
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] * 2 * i;
            } else if (prime(arr[i])) {
                arr[i] = arr[i] + 3* i;
            }else{
                arr[i] = arr[i] - i;
            }

        }
        for (int i = 0 ; i < SIZE ; i++){
            System.out.println(arr[i]);
        }
    }

    public static boolean prime(int number) {
       boolean result = true;
        if(number == 1){
            result = false;
        }
        for(int i = 3; i < number / 2; i = i + 2) {
            if(number % i == 0) {
                result = false;
            }
        }
       return true;
    }
}