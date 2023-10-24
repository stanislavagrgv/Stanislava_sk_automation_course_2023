package L02;

import java.util.Scanner;
import java.lang.Math;

public class Homework_02 {

        public static void main(String[] args) {

            minutesToDaysAndYears2();
            // minutesToDaysAndYears1();
            // quadraticEquation();
            // printAsteriskPineTree ();
            // printTriangleArea();
            // printNames();
        }

        public static void printNames() {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter username:");

            String userName = myObj.nextLine();
            System.out.println("Username is: " + userName);
        }

        public static void printTriangleArea() {
            double a = 51;
            double b = 12;
            double c = 48;
            double semi_p;
            double area;

            semi_p = (a + b + c) / 2;
            area = Math.sqrt(semi_p * (semi_p - a) * (semi_p - b) * (semi_p - c));

            System.out.printf("The area of the triangle is: " + area);
            // System.out.printf("The area of the triangle is: " + "%,.2f", area);
        }

        public static void printAsteriskPineTree() {

            System.out.println("    *    ");
            System.out.println("   ***   ");
            System.out.println("  *****  ");
            System.out.println(" ******* ");
            System.out.println("*********");
            System.out.println("   ***   ");
            System.out.println("   ***   ");

        }


    public static void quadraticEquation() {
        int a, b, c;
        double d, x1, x2;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Въведете a = ");
        a = myObj.nextInt();
        System.out.println("Въведете b = ");
        b = myObj.nextInt();
        System.out.println("Въведете c = ");
        c = myObj.nextInt();

        d = (b * b) - (4 * a * c);

        if (d == 0) {
            x1 = (-b / 2) * a;
            System.out.println("Корените на уравненинето са x1=x2= " + x1);

        } else {
            if (d > 0) {
                x1 = (-b + Math.sqrt(d)) / 2 * a;
                x2 = (-b - Math.sqrt(d)) / 2 * a;
                System.out.println("Корен x1= " + x1);
                System.out.println("Корен x2= " + x2);
            } else {
                System.out.println ("Няма реални корени.");
            }
        }
    }


        public static void minutesToDaysAndYears1() {

            int minutes1;
            int minutesInDays1, remainingMinutesOfDays1;
            int minutesInYears1, remainingMinutesOfYears1;

            Scanner myObj = new Scanner(System.in);
            System.out.println("Въведете минути = ");
            minutes1 = myObj.nextInt();

            minutesInDays1 = minutes1 / 1440;
            remainingMinutesOfDays1 = minutes1 % 1440;

            minutesInYears1 = minutes1 / 525600;
            remainingMinutesOfYears1 = minutes1 % 525600;

            System.out.println(minutes1
                    + " минути се равняват на "
                    + minutesInDays1
                    + " дни и " + remainingMinutesOfDays1 + " минути");

            System.out.println(minutes1
                    + " минути се равняват на "
                    + minutesInYears1
                    + " години  и " + remainingMinutesOfYears1 + " минути");

        }

        public static void minutesToDaysAndYears2() {

            int minutes;
            int minutesInYears, remainingMinutesOfYears;
            int minutesInDays, remainingMinutesOfDays;

            Scanner myObj = new Scanner(System.in);
            System.out.println("Въведете минути:");
            minutes = myObj.nextInt();

            minutesInYears = minutes / 525600;
            remainingMinutesOfYears = minutes % 525600;

            minutesInDays = remainingMinutesOfYears / 1440;
            remainingMinutesOfDays = remainingMinutesOfYears % 1440;

            System.out.println(minutes
                    + " минути се равняват на "
                    + minutesInYears
                    + " години, "
                    + minutesInDays
                    + " дни и "
                    + remainingMinutesOfDays
                    + " минути");
        }

}
