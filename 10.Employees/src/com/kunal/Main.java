package com.kunal;

public class Main {

    public static void main(String[] args) {
	// write your code here
         Employees employees1 = new Employees();
         Employees employees2 = new Employees();
         Employees employees3= new Employees();

         employees1.set("RobertWallsStreat",1994,64);
         employees2.set("sam WallsStreat" , 2000,68);
         employees3.set("John WallsStreat", 1999, 26);

        employees1.show();
        employees2.show();
        employees3.show();
    }
}
