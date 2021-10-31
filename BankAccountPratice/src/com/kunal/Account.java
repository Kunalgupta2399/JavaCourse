package com.kunal;
//account - name, address, number, amount
// withdraw, deposit
// FD - 6%
// 2 account - account details

import java.util.Scanner;

public class Account {
    private String name;
    private int AccountNumber;
    private String address;
    private float balance;
    private float amount;


    public void withdraw(float amount){
        float NewBalance = this.balance - amount;
        if (NewBalance >= 10000){
            this.balance =  NewBalance;
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    public void deposit(float amount){
        this.balance = this.balance + amount;
        System.out.println(this.balance);
    }

    public void set(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Your Name");
//        this.name = scanner.nextLine();
//        System.out.println("Enter Your Account Number");
//        this.AccountNumber = scanner.nextInt();
//        System.out.println("Enter Your Address");
//        this.address = scanner.nextLine();
//        System.out.println("Enter Your Amount");
//        this.amount = scanner.nextInt();



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        name = scanner.nextLine();
        System.out.println("Enter your address");
        address = scanner.nextLine();
        System.out.println("Enter your Account Number");
        AccountNumber = scanner.nextInt();
        System.out.println("Enter your amount");
        balance = scanner.nextInt();
    }
    public void show(){
        System.out.println(name);
        System.out.println(AccountNumber);
        System.out.println(address);
        System.out.println(balance);

    }
}
