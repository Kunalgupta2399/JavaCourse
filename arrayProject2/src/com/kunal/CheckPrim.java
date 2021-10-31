package com.kunal;

import java.util.Scanner;

public class CheckPrim {
    public static void main(String[] args) {
        int number;
        boolean result = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        number = scanner.nextInt();

        if (number % 2 == 0) {
            result = false;
        }
        for (int i = 3; i < number / 2; i = i + 2) {
            if (number % i == 0) {
                result = false;
            }
        }
        if (result){
            System.out.println("prime");
        }else {
            System.out.println("composite");
        }
    }
}
