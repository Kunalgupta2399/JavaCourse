package com.kunal;

import java.util.Scanner;

public class Address {
    private String country;
    private String state;
    private String city;
    private String postcode;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
    public void getAddress(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Country");
        country = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter your State");
        state = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter Your City");
        city = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter Your Postcode");
        postcode = scanner.nextLine();
        scanner.nextLine();

    }

}
