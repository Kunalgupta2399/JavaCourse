package com.kunal;

import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your size");
        int SIZE = scanner.nextInt();
        String[]name = new String[SIZE];



        scanner.nextLine();
        for(int i = 0 ; i < SIZE ; i++){
            System.out.println("Enter Your input :" + i);
            name[i] = scanner.nextLine();

        }
        String search;
        System.out.println("Enter your search element");
        search = scanner.nextLine();


        boolean found = false;
        for (int i = 0 ; i <SIZE ; i++){
            if(name[i].equals(search) ){
                found = true;
                System.out.println(i);
            }
        }

        if ( found){
            System.out.println("Found it");
        }else {
            System.out.println("Not Found");
        }
    }
}
