package org.example.solid;

public class Cube implements Shape, ThreeDimensionalShape{
    private int side;

    public Cube(int side) {this.side = side;}

    public int getSide() {
        return side;
    }

    @Override
    public double area() {
        return Math.pow(getSide(), 2) * 6;
    }

    @Override
    public double volume() {
        return Math.pow(getSide(), 3);
    }
}
