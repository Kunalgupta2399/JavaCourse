package com.kunal;

import java.util.Scanner;

public class Marks {
    private float physics;
    private float chemistry;
    private float maths;
    private float english;
    private float computerScience;

    public float getPhysics() {
        return physics;
    }

    public void setPhysics(float physics) {
        this.physics = physics;
    }

    public float getChemistry() {
        return chemistry;
    }

    public void setChemistry(float chemistry) {
        this.chemistry = chemistry;
    }

    public float getMaths() {
        return maths;
    }

    public void setMaths(float maths) {
        this.maths = maths;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public float getComputerScience() {
        return computerScience;
    }

    public void setComputerScience(float computerScience) {
        this.computerScience = computerScience;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "physics=" + physics +
                ", chemistry=" + chemistry +
                ", maths=" + maths +
                ", english=" + english +
                ", computerScience=" + computerScience +
                '}';
    }

    public void getMArks(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter score for Physics : " );
        this.physics = scanner.nextFloat();
        System.out.println("Enter score for Maths : " );
        this.maths = scanner.nextFloat();
        System.out.println("Enter score for Chemistry : " );
        this.chemistry = scanner.nextFloat();
        System.out.println("Enter score for English : " );
        this.english = scanner.nextFloat();
        System.out.println("Enter score for Computer Science : " );
        this.computerScience = scanner.nextFloat();
    }
}
