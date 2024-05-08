package org.example.solid;

import java.util.List;

public class AreaCalculatorV2 implements IAreaCalculator {

    @Override
    public int sum(List<Shape> shapes) {
        // CHANGED THIS FOR DEMONSTRATION, I KNOW IT DOESN'T MAKE SENSE
        int sum = 1;
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            sum *= shape.area();
        }
        return sum;
    }
}
