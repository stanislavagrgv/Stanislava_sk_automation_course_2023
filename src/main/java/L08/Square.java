package L08;

public class Square extends Shape {
    @Override
    public double getArea(double number) {
        double squareSide = number;
        double squareArea = Math.pow(squareSide, 2);
        return squareArea;
    }

    @Override
    public double getPerimeter(double number) {
        double squareSide = number;
        double squarePerimeter = squareSide * 4;
        return squarePerimeter;
    }
}
