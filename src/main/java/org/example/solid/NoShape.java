package org.example.solid;

public class NoShape implements Shape{
    @Override
    public double area() {
        throw new IllegalStateException("NoShape does not have area to return/calculate");
    }
}
