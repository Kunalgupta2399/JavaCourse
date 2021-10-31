package com.kunal;

public class Employees {
    private String name ;
    private int year;
    private int add;

    public void set(String name , int year , int add){
        this.name = name;
        this.year = year;
        this.add = add;
    }
    public void show(){
        System.out.println("Name"+ name);
        System.out.println("Year"+ year);
        System.out.println("Address"+ add);
    }
}
