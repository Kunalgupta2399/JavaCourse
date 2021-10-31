package com.kunal;

import java.util.Scanner;

public class sumInarray {
    public static void main(String[] args) {
        final int Size = 5;
        Scanner scanner = new Scanner(System.in);
        int[]add = new int[Size];
        int sum = 0;

        for(int i = 0 ; i < Size ; i++){
            System.out.println("Enter your number" + i);
            add[i] = scanner.nextInt();
            sum = sum + add[i];

        }System.out.println(sum);
    }

}
