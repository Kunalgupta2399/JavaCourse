package com.kunal;

public class Average {
    private int a;
    private int b;
    private int c;

    private double Average_number() {
        return (a + b + c) / 3;
    }

        public void set(int a , int b , int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
    public void show(){
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("Number 1 =" + a);
        System.out.println("Number 2 =" + b);
        System.out.println("Number 3 =" + c);
        System.out.println("Average of Three Numbers is =" + Average_number());

    }



}
