package org.example;

import java.util.Random;

public class Sphere implements Shape3DInterface {
    private final double radius;

    public Sphere() {
        Random random = new Random();
        this.radius = 1 + random.nextDouble() * 9; // Radius between 1 and 10
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere with radius: " + radius;
    }
}