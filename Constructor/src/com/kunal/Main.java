package com.kunal;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student s1 = new Student();
        Student s2 = new Student("kunal" , 2399 , 10000);
        Student s3 = new Student(s2);

        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s1.toString());
    }
}
