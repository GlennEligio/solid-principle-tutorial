package org.example.solid;

public class Circle implements Shape {

    private final int radius;

    public Circle(int radius) { this.radius = radius; }

    public int getRadius() { return this.radius; }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
