package org.example.solid;

import java.util.List;

public class ShapesPrinter {

    private AreaCalculator areaCalculator;

    public ShapesPrinter(AreaCalculator areaCalculator) { this.areaCalculator = areaCalculator; }

    public String json(List<Shape> shapes) {
        return "{ sum : %s }".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return "sum,%s".formatted(areaCalculator.sum(shapes));
    }
}
