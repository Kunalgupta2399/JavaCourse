package com.kunal;

import java.util.Scanner;

public class Ticket {
    private String name;
    private int age;
    private int number_of_passengers;
    private String arrival;
    private String departure;
    private int cost;

    public Ticket() {
        System.out.println("this is default constructor");
    }

    public Ticket(String name, int age, int number_of_passengers, String arrival, String departure) {
        System.out.println("This is parameterised constructor");
        this.name = name;
        this.age = age;
        this.number_of_passengers = number_of_passengers;
        this.arrival = arrival;
        this.departure = departure;
        this.cost = cost;
    }

    public Ticket(Ticket ticket) {
        System.out.println("this is Copy constructor");
        this.name = ticket.name;
        this.age = ticket.age;
        this.number_of_passengers = ticket.number_of_passengers;
        this.arrival = ticket.arrival;
        this.departure = ticket.departure;
        this.cost = ticket.cost;
    }

    public void update_name(String newname){
        this.name = newname;
    }
    public void update_passengers(int newPassengers){
        this.number_of_passengers = newPassengers;
    }



    public void set(){
        Scanner sc= new Scanner(System.in);
        System.out.println("name");
        name  = sc.nextLine();
        System.out.println("age");
        age = sc.nextInt();
        System.out.println("number_of_passengers");
        number_of_passengers = sc.nextInt();
        System.out.println("arrival");
        arrival = sc.nextLine();
        sc.nextLine();
        System.out.println("Departure");
        departure = sc.nextLine();
        System.out.println("cost");
        cost = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number_of_passengers=" + number_of_passengers +
                ", arrival='" + arrival + '\'' +
                ", departure='" + departure + '\'' +
                ", cost=" + cost +
                '}';
    }


}
