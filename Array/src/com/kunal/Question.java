package com.kunal;

import java.util.Scanner;

public class Question {

    public static int[] prodDelivery(int[] orderID) {
        int [] answer = new int[100];

        for (int i = 0; i < orderID.length; i++) {
            answer[i] = sumDigit(orderID[i]);
        }

        return answer;
    }

    private static int sumDigit(int number) {
        int temp = number;
        int sum = 0;
        while(temp != 0) {
            sum += temp % 10;
            temp = temp  / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfClient;
        numberOfClient = scanner.nextInt();

        int [] orderID = new int[numberOfClient];

        for (int i = 0; i < orderID.length; i++) {
            orderID[i] = scanner.nextInt();
        }

        int [] prodID = prodDelivery(orderID);

        for (int i = 0; i < orderID.length; i++) {
            System.out.print(prodID[i] + ", ");
        }
    }
}
