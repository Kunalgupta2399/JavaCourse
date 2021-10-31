package com.kunal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ticket t1 = new Ticket("kanishk", 24, 10, "DEL", "BLR");
        Ticket t2 = new Ticket();
//        Ticket t4 = new Ticket();

        System.out.println("References before : ");
        System.out.println(t1);
        System.out.println(t2);
        t2 = t1;
        Ticket t3 = new Ticket(t1);
//        t1.set();
        System.out.println(t1.toString());
        t1.update_passengers(5);
        t1.update_name("kishan");
        System.out.println("T1" + t1.toString());
        System.out.println("T2" + t2.toString());
        System.out.println("T3" + t3.toString());
//        System.out.println("T4" + t4.toString());

        System.out.println("References before : ");
        System.out.println(t1);
        System.out.println(t2);

    }
}
