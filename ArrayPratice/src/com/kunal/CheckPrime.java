package com.kunal;

import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {
        int number;
        boolean result = true; //default case yes it's prime

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to be checked : ");
        number = scanner.nextInt();

        if(number % 2 == 0) {
            result = false;
        }

        for(int i = 3; i < number / 2; i = i + 2) {
            if(number % i == 0) {
                result = false;
            }
        }

        if(result) {
            System.out.println("prime");
        } else {
            System.out.println("composite");
        }

    }
}
