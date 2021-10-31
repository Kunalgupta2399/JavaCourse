package com.kunal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ComplexNumber c1 = new ComplexNumber();
        ComplexNumber c2 = new ComplexNumber();
        ComplexNumber answer = new ComplexNumber();
        System.out.println("enter yur number1:");
        c1.set();
        System.out.println("enter your 2 number :");
        c2.set();

        System.out.println("Addition of them : ");
        answer = c1.add(c2);
        answer.print();

    }
}
