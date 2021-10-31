package com.kunal;

import java.util.Scanner;

public class Main {

    private static final int SIZE = 5;

    public static void main(String[] args) {

        String[] names = new String[SIZE];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < SIZE; i++) {
            System.out.print("Enter name #" + i + " : ");
            names[i] = scanner.nextLine();
        }

        System.out.println("Enter the element to be searched : ");
        String element = scanner.nextLine();
        boolean found = false; //default case not found

        for(int i = 0; i < SIZE; i++) {
            if(names[i].equals(element)) {
                System.out.println("Found at " + i );
                found = true;
            }
        }

        if(found) {
            System.out.println("hurray!");
        } else {
            System.out.println("not found in the array");
        }

    }

}
