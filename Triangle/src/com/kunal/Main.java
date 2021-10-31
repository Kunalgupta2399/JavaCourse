package com.kunal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();

        triangle1.set_sides(30,30,30);
        triangle2.set_sides(9, 40, 41);

        triangle1.show();
        triangle2.show();
    }
}
