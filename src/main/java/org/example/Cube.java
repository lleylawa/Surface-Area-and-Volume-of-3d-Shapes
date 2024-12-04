package org.example;

import java.util.Random;

public class Cube implements Shape3DInterface {
    private final double side;

    public Cube() {
        Random random = new Random();
        this.side = 1 + random.nextDouble() * 9; // Side between 1 and 10
    }

    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return "Cube with side: " + side;
    }
}


