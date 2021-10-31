package com.kunal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account acc1 = new Account();


        acc1.set();

        acc1.show();
        acc1.deposit(5000);
        acc1.show();
        acc1.withdraw(4000);

    }
}
