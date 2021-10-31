package com.kunal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int n = 7;
        int p = 1;


        //print grid
        for (int i = 0; i < n; i++) {
            p = 1;
            for (int j = 0; j < n; j++) {
                if(i + j < n - 1) {
                    System.out.print(" _ ");
                } else {
                    System.out.print(" " + p + " ");
                    p++;
                }
            }
            p--;
            for (int j = 0; j < i; j++) {
                if(i > 0){
                    p--;
                    System.out.print(" " + p + " ");
                }
            }

            System.out.println();
        }
    }
}
