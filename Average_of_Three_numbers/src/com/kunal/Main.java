package com.kunal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Average average1 = new Average();
        Average average2 = new Average();

        average1.set(3,6,9);
        average2.set(22,44,76);


        average2.show();
        average1.show();
    }
}
