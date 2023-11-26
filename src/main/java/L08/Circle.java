package L08;

import java.lang.Math;

public class Circle extends Shape {
    @Override
    public double getArea(double number) {
        double circleRadius = number;
        double circleArea = Math.PI * Math.pow(circleRadius, 2);
        return circleArea;
    }

    @Override
    public double getPerimeter(double number) {
        double circleRadius = number;
        double circlePerimeter = Math.PI * circleRadius * 2;
        return circlePerimeter;
    }
}
