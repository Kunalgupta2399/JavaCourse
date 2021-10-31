package com.kunal;

public class Cuboid {
    private double length;
    private double breadth;
    private double height;

    private double TSA(){
        return 2 * ((length * breadth) +(breadth * height) + (height * length));
    }
    private double LSA(){
        return 2 * ( length + breadth) * height;
    }
    private double Volume(){
        return length * breadth * height;
    }

    public  void set(double length , double breadth , double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public void show(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("length is " + this.length);
        System.out.println("breadth is " + this.breadth);
        System.out.println("height is " + this.height);
        System.out.println("TSA is " + this.TSA());
        System.out.println("LSA is " + this.LSA());
        System.out.println("Volume is " + this.Volume());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-");
    }


}
