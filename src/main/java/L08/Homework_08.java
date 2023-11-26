package L08;

public class Homework_08 {

    public static void main(String[] args) {

        Circle s1 = new Circle();
        System.out.println(s1.getArea(3.0)); // expected ~ 28.27
        System.out.println(s1); // expected 3.0

        Shape s2 = new Circle(); // Upcast Circle to Shape
        System.out.println(s2.getArea(3.0)); // expected error, no logic in abstract methods in Shape class
        System.out.println(s2); //

        Circle s3 = (Circle) s2; // Downcast back to Circle
        System.out.println(s3); // expected 3.0
        System.out.println(s2.getPerimeter(3.0)); // expected ~ 18.85
        // Square s4 = new Shape();
        Square s5 = new Square();
        System.out.println(s5.getArea(6.0)); // expected 36
        System.out.println(s5.getPerimeter(6.0)); // expected 24

    }

}
