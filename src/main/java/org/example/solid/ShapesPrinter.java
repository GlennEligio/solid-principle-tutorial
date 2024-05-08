package org.example.solid;

import java.util.List;

public class ShapesPrinter {

    private IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) { this.areaCalculator = areaCalculator; }

    public String json(List<Shape> shapes) {
        return "{ sum : %s }".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return "sum,%s".formatted(areaCalculator.sum(shapes));
    }
}
