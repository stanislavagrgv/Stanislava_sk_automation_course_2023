package L06;

import java.util.*;
import java.lang.*;


public class Homework_06 {
    public static void main(String[] args){

        // displayMiddleCharacter("toyota");
        // System.out.print("The number is even: " + isEven(2545));
        System.out.println(isNumberPalindrome(54145));
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

    public static boolean isNumberPalindrome(int number){

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

}
