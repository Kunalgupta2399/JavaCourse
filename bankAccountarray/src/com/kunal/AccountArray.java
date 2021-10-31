package com.kunal;

import java.util.Scanner;

public class AccountArray {
    Scanner scanner = new Scanner(System.in);
    final int Size = 5;
    private  String name;
    private String Address;
    private int accNumber;
    private double[]amount;

    public AccountArray(){
        this.amount = new double[Size];
    }

    public void set(){
        System.out.println("Enter Your Name");
        name = scanner.nextLine();
        System.out.println("Enter your address");
        Address = scanner.nextLine();
        System.out.println("Enter your AccNumber");
        accNumber = scanner.nextInt();
        System.out.println("Enter your monthly Deposit");
        for (int i = 0 ; i < Size ; i++){
            amount[i] = scanner.nextDouble();
        }
        }


    public void show(){
        System.out.println("name : " + this.name);
        System.out.println("account number : " + this.accNumber);
        System.out.println("address : " + this.Address);
        System.out.println("Monthly Deposit : ");
        for (int i = 0 ; i < Size ; i++){
            System.out.println(amount[i]);
        }
        System.out.println("annual total : " + monthly());
        System.out.println("interest on total : " + intrest());


    }




    public double monthly() {
        double sum = 0;
        for (int i = 0; i <Size ; i++){
            sum = sum + amount[i];
//            System.out.println(sum);
        }
        return sum;
    }


    public double intrest(){
          return (monthly() * 0.1);
    }

}
