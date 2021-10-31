package com.kunal;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        double n = scanner.nextDouble();
        double x = scanner.nextDouble();
        double sum = 0;
            for (int i = 1; i <= n; i++) {
                double c = Math.pow(x, i) / factorial(i);
                sum = sum + c;
            }

        System.out.println(sum);
    }

    private static double factorial(double num) {

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return factorial;
    }
}