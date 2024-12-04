package org.example;

import java.util.Random;

public class Cylinder implements Shape3DInterface {
    private final double radius;
    private final double height;

    public Cylinder() {
        Random random = new Random();
        this.radius = 1 + random.nextDouble() * 9; // Radius between 1 and 10
        this.height = 5 + random.nextDouble() * 15; // Height between 5 and 20
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder with radius: " + radius + " and height: " + height;
    }
}