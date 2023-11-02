package L07;

public class Homework_L07 {

    public static void main (String[] args) {

    // Car myCar1 = new Car();
    // Car myCar2 = new Car("VW","grey", 1999, 120, true);
    // Car myCar3 = new Car("Mercedes", "blue", false);
    // Car myCar4 = new Car("","",2010, 150);
    // Car myCar5 = new Car("", 2020, 180, false);

    // divideTwoNumbers(55,0);

}

    public static void divideTwoNumbers(int number1, int number2) {
        double division;

           try{
               division = number1 / number2;
               System.out.println(division);
           } catch (ArithmeticException e){
               System.out.println("Division by zero is not possible!");
           }

    }

}