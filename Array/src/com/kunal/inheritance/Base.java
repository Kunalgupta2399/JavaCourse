package com.kunal.inheritance;

public class Base {

    private int number;
    private String name;

//    public Base() {
//    }

    public Base(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public void function() {
        System.out.println("base is functioning");
    }

    @Override
    public String toString() {
        return "Base{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
