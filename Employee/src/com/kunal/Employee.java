package com.kunal;

import java.util.Scanner;

public class Employee {
    private int Employee_id;
    private String name;
    private String DateOfBirth;
    private String DateOfJoining;
    private String role;
    private int salary;

    public void Calculate_Bonus(){
        if(salary >= 10000){
            System.out.println("Your Bonus is " + salary * 0.1);
        }else if (salary >= 20000){
            System.out.println("Your Bonus is " + salary * 0.2);
        }else if (salary > 20000){
            System.out.println("Your Bonus is " + salary* 0.3);
        }else{
            System.out.println("No bonus");
        }
    }

    public void set(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your id");
        Employee_id = scanner.nextInt();
        System.out.println("Enter your name");
        scanner.nextLine();
        name = scanner.nextLine();
        System.out.println("Enter your DOB");
        DateOfBirth = scanner.nextLine();
        System.out.println("Enter Your DOJ");
        DateOfJoining = scanner.nextLine();
        System.out.println("Enter you role");
        role = scanner.nextLine();
        System.out.println("Enter your salary");
        salary = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Employee_id=" + Employee_id +
                ", name='" + name + '\'' +
                ", DateOfBirth='" + DateOfBirth + '\'' +
                ", DateOfJoining='" + DateOfJoining + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}
