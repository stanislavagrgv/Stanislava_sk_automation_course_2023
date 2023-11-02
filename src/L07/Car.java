package L07;

public class Car {
    String name, colour;
    int releaseYear, horsePower;
    Boolean secondHand;

    public Car() {
    }

    public Car(String name, int releaseYear, int horsePower, Boolean secondHand) {
        this (name, "N/A", releaseYear, horsePower, secondHand);
    }

    public Car(String name, String colour, int releaseYear, int horsePower) {
        this(name, colour, releaseYear, horsePower, false);
    }

    public Car(String name, String colour, Boolean secondHand) {
        this(name, colour, -1, -1, secondHand);
    }

    public Car(String name, String colour, int releaseYear, int horsePower, Boolean secondHand) {
        this.name = name;
        this.colour = colour;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHand = secondHand;

    }
}
