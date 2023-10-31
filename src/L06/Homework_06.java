package L06;

import java.util.*;
import java.lang.*;


public class Homework_06 {
    public static void main(String[] args){

        // displayMiddleCharacter("toyota");
        // System.out.print("The number is even: " + isEven(2545));
        isNumberPalindrome();
    }

    public static void displayMiddleCharacter (String value) {

        int index = value.length() / 2;;

        if (value.length() % 2 == 0) {
            System.out.print(value.charAt(index-1));
            System.out.print(value.charAt(index));
        } else System.out.println(value.charAt(index));
    }

    public static boolean isEven(int argument) {

        boolean result;

        if (argument % 2 == 0) {
            result = true;
        } else result = false;
        return result;
    }

    public static boolean checkForPalindrome(int number){

        boolean result;
        int temp = Math.abs(number);
        int newNumber = temp % 10;

        while (temp > 10 ){
            temp = temp / 10;
            newNumber = (newNumber * 10) + (temp % 10);
        }

        if (number == newNumber) {
            result = true;
        } else result = false;

        return result;
    }

    public static void isNumberPalindrome() {

        int numberToCheck;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative number: ");
        numberToCheck = scanner.nextInt();

        if (numberToCheck < 0) {
            System.out.println("You have entered a negative number!");
        } else if (checkForPalindrome(numberToCheck)) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }

    }

}
