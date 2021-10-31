package com.kunal;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int row, column;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter row :");
        row = scanner.nextInt();
        System.out.println("Enter column");
        column = scanner.nextInt();

        int[][] a = new int[row][column];
        int[][] b = new int[row][column];

        inputMatrix(a);
        inputMatrix(b);

        int[][] sum = sum(a, b);
        int[][] subtract = subtract(a, b);

        displayMatrix(a);
        displayMatrix(b);
        displayMatrix(sum);
        displayMatrix(subtract);
    }


    private static void displayMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println(matrix[i][j] + ", ");
            }
        }
        System.out.println();
    }


    private static void inputMatrix(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        int row = matrix.length;
        int column = matrix[0].length;

        System.out.println("Enter matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static int[][] subtract(int[][] a, int[][] b) {

        int rowA = a.length;
        int rowB = b.length;

        int columnA = a[0].length;
        int columnB = a[0].length;

        if (rowA == rowB && columnB==columnA){
            int[][] subtract = new int[rowA][rowB];
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    subtract[i][j] = a[i][j] - b[i][j];
                }
            }
            return subtract;

        }else{
            System.out.println("Cannot Subtract");
        }return null;

    }


        private static int[][] sum ( int[][] a, int[][] b){
            int rowA = a.length;
            int rowB = b.length;

            int columnA = a[0].length;
            int columnB = a[0].length;

            if (rowA == rowB && columnB == columnA) {

                int[][] sum = new int[rowA][columnA];
                for (int i = 0; i < rowA; i++) {
                    for (int j = 0; j < columnA; j++) {
                        sum[i][j] = a[i][j] + b[i][j];
                    }
                }
                return sum;
            } else {
                System.out.println("cannot add");
                return null;
            }
        }
    }



