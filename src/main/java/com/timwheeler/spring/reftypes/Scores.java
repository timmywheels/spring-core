package com.timwheeler.spring.reftypes;

public class Scores {

    private double math;
    private double physics;
    private double computerScience;

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysics() {
        return physics;
    }

    public void setPhysics(double physics) {
        this.physics = physics;
    }

    public double getComputerScience() {
        return computerScience;
    }

    public void setComputerScience(double computerScience) {
        this.computerScience = computerScience;
    }

    @Override
    public String toString() {
        return "Scores{" +
                "math=" + math +
                ", physics=" + physics +
                ", computerScience=" + computerScience +
                '}';
    }
}
