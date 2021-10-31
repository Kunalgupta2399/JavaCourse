package com.kunal.inheritance;

public class Derived extends Base{

    private int count;
    private String string;

    public Derived(int number, String name) {
        super(number, name);
    }

    public Derived(int number, String name, int count, String string) {
        super(number, name);
        this.count = count;
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "Derived{" +
                "count=" + count +
                ", string='" + string + '\'' +
                '}';
    }

    public void function() {
        super.function();
        System.out.println("Derived is functioning");
    }
}
