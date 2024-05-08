package org.example.solid;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculator);
        Circle circle = new Circle(6);
        Square square = new Square(5);
        Cube cube = new Cube(2);
        Rectangle rectangle = new Rectangle(2,10);
        List<Shape> shapes = List.of(circle, square, cube,rectangle);
        int sum = areaCalculator.sum(shapes);
        System.out.println(shapesPrinter.json(shapes));
        System.out.println(shapesPrinter.csv(shapes));
    }
}