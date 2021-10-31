package com.kunal;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        //declare row and column

        int row, column;
        //take input
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter row : ");
        row = scanner.nextInt();
        System.out.println("enter column : ");
        column = scanner.nextInt();

//       make a space or allocate memory

        int [][] a = new int[row][column];
        int [][] b = new int[row][column];

//      take input function

        inputMatrix(a);
        inputMatrix(b);

//      make function of sum and difference

        int [][] sum = sumMatrix(a, b);
        int [][] difference = differenceMatrix(a, b);

//      display or print

        displayMatrix(a);
        displayMatrix(b);
        displayMatrix(sum);
        displayMatrix(difference);
    }

    private static int[][] differenceMatrix(int[][] a, int[][] b) {

    //      check length of matrix else don't add

        int rowA = a.length;
        int rowB = b.length;

        //check length of column

        int columnA = a[0].length;
        int columnB = b[0].length;

        if (rowA == rowB && columnB == columnA) {
            int [][] difference = new int [rowA][columnA];
            //logic
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    difference[i][j] = a[i][j] - b[i][j];
                }
            }
            return difference;
        } else {
            System.out.println("cannot Subtract");
            return null;
        }
    }

    private static int [][] sumMatrix(int[][] a, int[][] b) {
        int rowA = a.length;
        int rowB = b.length;

        int columnA = a[0].length;
        int columnB = a[0].length;

        if (rowA == rowB && columnB == columnA) {
            int [][] sum = new int [rowA][columnA];
            //logic
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


    private static void displayMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
    }

    private static int[][] multiplyMatrix(int [][] a, int [][] b) {
        //homework
        return null;
    }


}
