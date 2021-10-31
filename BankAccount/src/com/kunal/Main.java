package com.kunal;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // account - name, address, number, amount
        // withdraw, deposit
        // FD - 6%
        // 2 account - account details
        Account acc1 = new Account();

        acc1.set();

        acc1.showDetails();
        acc1.deposit(500);
        acc1.showDetails();
        acc1.withdraw(900);
        acc1.showDetails();
        acc1.FD(5000);
        acc1.showDetails();
    }
}
