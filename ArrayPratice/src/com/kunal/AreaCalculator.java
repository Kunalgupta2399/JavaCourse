package com.kunal;

import java.util.Scanner;

public class AreaCalculator {

    // take array of float (squareSides)
    //create a method area(float side) -> gives area of equilateral triangle
    //traverse through the array and calculate the area of each element as side
    //update the array with the areas and print the same
    private static final int SIZE= 4;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] arr  = new float[SIZE];

        for (int i = 0 ; i < SIZE ; i++){
            System.out.println("Enter you number :" + i);
            arr[i] = scanner.nextFloat();
        }

        System.out.println("Your Entered Number is");
        printArray(arr);

        System.out.println("Area of Entered arry is");

        for (int i = 0 ; i < SIZE ; i++){
            arr[i] = area(arr[i]);
        }

        printArray(arr);
    }


    public static float area(float side){
        return (float) (Math.PI *side * side);
    }

    public static void printArray(float[] arr){
        for (int i = 0 ; i < SIZE ; i++){
            System.out.println(arr[i]);
        }
    }
}


