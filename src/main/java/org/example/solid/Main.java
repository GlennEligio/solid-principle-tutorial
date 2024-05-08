package org.example.solid;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        IAreaCalculator areaCalculatorV2 = new AreaCalculatorV2();
        ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculator);
        ShapesPrinter shapesPrinterV2 = new ShapesPrinter(areaCalculatorV2);
        Shape circle = new Circle(6);
        Shape square = new Square(5);
        Shape cube = new Cube(2);
        Shape rectangle = new Rectangle(2,10);
        List<Shape> shapes = List.of(circle, square, cube,rectangle);
        int sum = areaCalculator.sum(shapes);
        System.out.println(shapesPrinter.json(shapes));
        System.out.println(shapesPrinter.csv(shapes));

        // Using AreaCalculatorV2
        System.out.println(shapesPrinterV2.json(shapes));
        System.out.println(shapesPrinterV2.csv(shapes));


        // Invalid interface implementation - violates the Liskov substitution principle
        // Shape noShape = new NoShape();

        // When commented out app will throw error
        // List<Shape> shapesWithInvalidItem = List.of(circle, square, cube,rectangle, noShape);
        // System.out.println(shapesPrinter.json(shapesWithInvalidItem));
        // System.out.println(shapesPrinter.csv(shapesWithInvalidItem));
    }
}