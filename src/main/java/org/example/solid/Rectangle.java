package org.example.solid;

public class Rectangle implements Shape{

    private int length;
    private int width;

    public Rectangle(int length, int width) {this.length = length; this.width = width;}

    public int getLength() { return length; }
    public int getWidth() {return width;}

    @Override
    public double area() {
        return getLength() * getWidth();
    }
}
