package L04;

import java.util.Scanner;

public class Homework_04 {
    public static void main(String[] args) {

        // triangleCalculation();
        // weekDays();
        // eligibleAge();
        // saleRevenue();
        // arrayMaxElement();
        vacationAdvice();
        // divisibleBy5Elements();
        // reverseList();

    }

    public static void triangleCalculation() {

        int angle1, angle2, angle3;
        int sumOfAngles;
        int triangleType = 0;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter triangle's first angle in degrees: ");
        angle1 = myObj.nextInt();
        System.out.println("Enter triangle's second angle in degrees: ");
        angle2 = myObj.nextInt();
        System.out.println("Enter triangle's first angles in degrees: ");
        angle3 = myObj.nextInt();

        sumOfAngles = angle1 + angle2 + angle3;

        if (sumOfAngles != 180) {
            System.out.println("A triangle cannot be built with the given angles.");
        } else {
            if ((angle1 < 60) && (angle2 < 60) && (angle3 < 60)) {
                System.out.println("The triangle is acute.");
            } else {
                if ((angle1 == 90) || (angle2 == 90) || (angle3 == 90)) {
                    System.out.println("The triangle is right-angled.");
                } else {
                    if ((angle1 > 90) || (angle2 > 90) || (angle3 > 90)) {
                        System.out.println("The triangle is obtuse.");
                    } else {
                        if ((angle1 == 60) && (angle2 == 60)) {
                            System.out.println("The triangle is equilateral.");
                        } else {
                            if (((angle1 == angle2) && (angle1 != angle3)) ||
                                    ((angle2 == angle3) && (angle2 != angle1)) ||
                                    ((angle3 == angle1) && (angle3 != angle2))) {
                                System.out.println("The triangle is isosceles.");
                            } else {
                                System.out.println("The triangle is multifaceted.");
                            }
                        }
                    }
                }
            }

        }

    }

    public static void weekDays() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the day of the week with a number between 1 and 7:");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("The " + day + "st day of the week is Monday.");
                break;
            case 2:
                System.out.println("The " + day + "nd day of the week is Tuesday.");
                break;
            case 3:
                System.out.println("The " + day + "rd day of the week is Wednesday.");
                break;
            case 4:
                System.out.println("The " + day + "th day of the week is Thursday.");
                break;
            case 5:
                System.out.println("The " + day + "th day of the week is Friday.");
                break;
            case 6:
                System.out.println("The " + day + "th day of the week is Saturday.");
                break;
            case 7:
                System.out.println("The " + day + "th day of the week is Sunday.");
                break;
            default:
                System.out.println("You have not entered a proper number.");
        }

    }

    public static void eligibleAge() {
        int age;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter your age:");
        age = myObj.nextInt();

        if (age >= 16) {
            System.out.println("You are eligible to work.");
        } else {
            System.out.println("You are not eligible to work.");
        }

    }

    public static void saleRevenue() {
        long unitPrice;
        long quantitySold;
        double discountPercent;
        double discountForSale;
        double revenue;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the unit price:");
        unitPrice = myObj.nextLong();
        System.out.println("Enter the quantity of sold units:");
        quantitySold = myObj.nextLong();

        Scanner myObjString = new Scanner(System.in);
        System.out.println("Enter the currency of unit price: ");
        String currency = myObjString.nextLine();

        if (quantitySold < 100) {
            discountPercent = 0;
        } else {
            if (quantitySold > 120) {
                discountPercent = 20;
            } else discountPercent = 15;

        }

        discountForSale = ((unitPrice * quantitySold) * discountPercent)/100;
        revenue = (unitPrice * quantitySold) - discountForSale;
        System.out.println("The revenue from sale: " + revenue + " " +currency);
        System.out.println("The discount: " + discountForSale + " " + currency
                + " " + "(" + discountPercent + " " + currency  + ")");
    }

    public static void arrayMaxElement() {

        double[] array = {-9.89, 15, 287.52, -98, 25587, 1, 11.25, 0, 9588, -11231.336, 22222.999};
        double maxElement;

        maxElement = array[0];
        for (int i=1; i < array.length;i++){
            if (maxElement < array[i]){
                maxElement=array[i];
            }
        }

        System.out.println("The largest element in the array is with value " + maxElement);
    }

    public static void vacationAdvice() {
        String vacationTypeChoice;
        int budget;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What holiday type do you prefer - beach or mountain?");
        vacationTypeChoice = scanner.nextLine();

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your holiday budget:");
        budget = myObj.nextInt();

        switch (vacationTypeChoice){
            case "beach":
            case "Beach":
                String advice1 = (budget <= 50) ? "We advise you to select a destination in Bulgaria." : "You can select a destination outside Bulgaria.";
                System.out.println(advice1);
                break;
            case "mountain":
            case "Mountain":
                String advice2 = (budget <= 30) ? "We advise you to select a destination in Bulgaria." : "You can select a destination outside Bulgaria.";
                System.out.println(advice2); break;
            default: System.out.println("You have not selected a proper holiday type.");
        }

    }

    public static void divisibleBy5Elements() {

        int [] list1 = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int i = 0; i < list1.length; i++) {
            if ((list1[i] % 5) == 0) {
                System.out.println(list1[i]);
            }
            if (list1[i] > 150) {
                break;
            }

        }

    }

    public static void reverseList() {
        int [] list1 = {10, 20, 30, 40, 50};
        int [] list2 = new int [list1.length];
        int j; // used for list1 element index
        int i; // used for list2 element index

        j = (list1.length) - 1;
        for (i = 0; i < list1.length; i++) {
            list2[i] = list1[j];
            j--;
        }

        for (i = 0; i < list1.length; i++) {
            System.out.println(list2[i]);
        }
    }

}
