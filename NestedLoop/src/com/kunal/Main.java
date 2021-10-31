package com.kunal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int maxRows = scanner.nextInt();
        System.out.println("Enter columns : ");
        int maxColumns = scanner.nextInt();

//        for (int row = 1; row < maxRows; row++) {
//            for(int column = 0; column < maxColumns; column++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
////
//        char letter = 'a';
//        for (int i = 1; i <= maxRows; i++) {
//            for(int j = 1; j <= i; j++) {
//                System.out.print(" "+letter+" ");
//                letter++;
//                if(letter > 'z') {
//                    letter = 'a';
//                }
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= maxRows; i++) {
            for(int j = 1; j <= maxColumns; j++) {
                if(j <= i - 1) {
                    System.out.print(" _ ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
//
        for (int i = 1; i <= maxRows; i++) {
            for(int j = 1; j <= (maxRows * 2) - 1; j++) {

                if(j <= maxRows - i) {
                    System.out.print(" _ ");
                } else if (j >= maxRows + i) {
                    System.out.print(" _ ");
                } else {
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }
    }
}
