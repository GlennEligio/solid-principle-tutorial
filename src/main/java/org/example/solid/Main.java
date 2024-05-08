package org.example.solid;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(6);
        Square square = new Square(5);
        List<Object> shapes = List.of(circle, square);
        int sum = areaCalculator.sum(shapes);
        System.out.println(areaCalculator.json(shapes));
    }
}