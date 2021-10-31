package com.kunal;

import java.util.Scanner;

public class ComplexNumber {
    private int real;
    private int imaginary;


    public ComplexNumber add(ComplexNumber complexNumber){
        ComplexNumber answer = new ComplexNumber();
        answer.real = this.real + complexNumber.real;
        answer.imaginary = this.imaginary + complexNumber.imaginary;

        return answer;
    }

    public ComplexNumber sub(ComplexNumber complexNumber){
        ComplexNumber answer = new ComplexNumber();
        answer.real = this.real - complexNumber.real;
        answer.imaginary = this.imaginary - complexNumber.imaginary;

        return answer;
    }

    public ComplexNumber multiply(ComplexNumber complexNumber){
        ComplexNumber answer = new ComplexNumber();
        answer.real = (this.real * complexNumber.real) - (this.imaginary * complexNumber.imaginary);
        answer.imaginary = (this.real * complexNumber.imaginary) + (this.imaginary * complexNumber.real);

        return answer;
    }
        public void print(){
            System.out.println(this.real + (this.imaginary)+"i");
        }

   public void set() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Real : ");
       this.real = scanner.nextInt();
       System.out.println("Imaginary : ");
       this.imaginary = scanner.nextInt();

       this.print();
   }

}
