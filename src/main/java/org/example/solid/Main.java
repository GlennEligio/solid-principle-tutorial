package org.example.solid;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculator);
        Shape circle = new Circle(6);
        Shape square = new Square(5);
        Shape cube = new Cube(2);
        Shape rectangle = new Rectangle(2,10);
        List<Shape> shapes = List.of(circle, square, cube,rectangle);
        int sum = areaCalculator.sum(shapes);
        System.out.println(shapesPrinter.json(shapes));
        System.out.println(shapesPrinter.csv(shapes));


        // Invalid interface implementation - violates the Liskov substitution principle
        // Shape noShape = new NoShape();

        // When commented out app will throw error
        // List<Shape> shapesWithInvalidItem = List.of(circle, square, cube,rectangle, noShape);
        // System.out.println(shapesPrinter.json(shapesWithInvalidItem));
        // System.out.println(shapesPrinter.csv(shapesWithInvalidItem));
    }
}