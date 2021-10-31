package com.kunal.inheritance;

public class MainRunner {

    public static void main(String[] args) {
        Base base = new Base(24, "kunal");

        Base derived = new Derived(45, "kanishk");

        base.function();
        derived.function();
    }
}
