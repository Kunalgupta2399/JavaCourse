package com.kunal;

import java.util.Scanner;

public class MakingFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();

        int fact = fact(n);
        int nprfact =fact(n-r);

        int npr = fact / nprfact;
        display (n , r , npr);
    }

    private static void display(int n, int r, int npr) {
        System.out.println(n+ "P" + r + "=" + npr);
    }
    public static int fact(int x ){
        int n = 1;
        for (int i = 0; i < x; i++) {
           n = n * i;
        }
        return n;

    }
}
