package com.kunal;

import java.util.Scanner;

public class Address {

    private String country;
    private String state;
    private String city;
    private String pincode;

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }

    public Address() {

    }

    public Address(String country, String state, String city, String pincode) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.pincode = pincode;
    }

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

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public void getAddress() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter country : ");
        this.country = scanner.nextLine();
        System.out.println("Enter city : ");
        this.city = scanner.nextLine();
        System.out.println("Enter pincode : ");
        this.pincode = scanner.nextLine();
    }
}
