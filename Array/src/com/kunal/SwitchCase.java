package com.kunal;

import java.util.Scanner;

public class SwitchCase {

    // menu driven program,
    // insert element in array
    // delete element in array
    // print array
    // search element in array

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        int[] array = new int[100];
        int size = 0;

        do {
            menu();
            System.out.println("Enter choice : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    //logic
                    int element;
                    System.out.println("Enter element : ");
                    element = scanner.nextInt();
                    size = insertArray(array, element, size);
                    System.out.println(element + " added to your array");
                    break;

                case 2:
                    //logic
                    System.out.println("Enter element : ");
                    element = scanner.nextInt();
                    size = deleteArray(array, element, size);
                    System.out.println(element + " removed from array");
                    break;

                case 3:
                    printArray(array, size);
                    break;

                case 4:
                    System.out.println("Enter element : ");
                    element = scanner.nextInt();
                    searchArray(array, element, size);
                    break;

                default:
                    System.out.println("invalid choice");
                    break;
            }


        } while (choice != 5);

    }

    private static int searchArray(int[] array, int element, int size) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element){
                System.out.println("mil Gya at " + i);
                return i;
            }
        }

        return -1;
    }

    private static void printArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    private static int deleteArray(int[] array, int element, int size) {
        int index = searchArray(array, element, size);

        if (index >= 0) {
            for (int i = index; i < size - 1; i++) {
                System.out.println("here");
                array[i] = array[i+1];
                printArray(array, size);
            }
            size--;
        } else {
            System.out.println("Can't find");
        }
        return size;
    }

    private static int insertArray(int[] array, int element, int size) {
        array[size] = element;
        size++;
        return size;
    }

    private static void menu() {

        System.out.println("<=======MENU=======>");
        System.out.println("1. insert");
        System.out.println("2. delete");
        System.out.println("3. print");
        System.out.println("4. search ");;
        System.out.println("5. quit");
    }

}
