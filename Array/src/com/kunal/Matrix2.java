package com.kunal;

import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {
        int row , column;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Row");
        row = scanner.nextInt();
        System.out.println("Enter Column");
        column = scanner.nextInt();

        int[][] a = new int[row][column];


        int[][] b = new int[row][column];

        inputmatrix(a);
        inputmatrix(b);

        int[][] sum = sumMatrix(a,b);
        int[][] diffrence = diffrenceMatrix(a,b);

        printMatrix(a);
        printMatrix(b);
        printMatrix(sum);
        printMatrix(diffrence);


    }

    private static void printMatrix(int[][] a) {
    }

    private static int[][] diffrenceMatrix(int[][] a, int[][] b) {
        int rowA = a.length;
        int rowB = b.length;

        int columnA = a[0].length;
        int columnB = b[0].length;

        if (rowA == rowB && columnB == columnA) {
            int [][] difference = new int [rowA][columnA];
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    difference[i][j] = a[i][j] -b[i][j];
                }
            }
            return difference;
        }else {
            System.out.println("Cannot sub");
            return null;
        }
    }

    private static int[][] sumMatrix(int[][] a, int[][] b) {
        int rowA = a.length;
        int rowB = b.length;

        int columnA = a[0].length;
        int columnB = b[0].length;

        if (rowA==rowB && columnB == columnA){
            int[][] sum = new int[rowA][columnA];
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    sum[i][j] = a[i][j] + b[i][j];
                }
            }
            return sum;
        }else {
            System.out.println("cannot add");
            return null;
        }
    }

    private static void inputmatrix(int[][] a) {
            Scanner scanner = new Scanner(System.in);
//            int row = Matrix2
    }
}
