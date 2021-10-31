package com.kunal;

public class Square extends Rectangle{
    int side;

    Square(int side) {
        super(side, side);
    }
    public void print(){
        System.out.println(super.angle);
        System.out.println("Square is a rectangle");
    }
}
