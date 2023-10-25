package L05;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Homework_05 {

    public static void main(String[] args) {

        // sumOfArrayElements();
        // elements2DArray();
        // elementsDynamic2DArray();
        // maxElementOfArray();
        // reverseLinkedList ();
        // sumOfDiagonal();
         checkPalindrome();

    }

    public static void sumOfArrayElements() {

        double[] array = {15.7, 18.25, 63, 28, -32, -5.24, 101};
        double sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum = sum + array[i];
        }

        System.out.println("The sum of the elements of the array is: " + sum);

    }

    public static void elements2DArray() {
        double [][] array2D  = {{11.5, 22.63, 2.6,-78.1}, {6.32, 555552, 661, -8.52}, {1.02, 6.3, 5.4, 6.9},};

        System.out.println("The elements of the 2D array are: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++){
                System.out.println("Element [" + i + "] [" + j + "] = " + array2D[i][j]);
            }
        }

    }

    public static void elementsDynamic2DArray() {

        int rows, columns;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows of a 2D array:");
        rows = scanner.nextInt();

        System.out.print("Enter the number of columns of a 2D array:");
        columns = scanner.nextInt();

        double [][] array2D = new double [rows][columns];

        System.out.println("Enter the elements of the array 2D array:");

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){

                System.out.print("Element [" + i + "] [" + j + "] = ");
                array2D[i][j] = scanner.nextDouble();

            }
        }

        System.out.println("The elements of the 2D array are: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++){
                System.out.println("Element [" + i + "][" + j + "] = " + array2D[i][j]);
            }
        }

    }

    public static void maxElementOfArray() {
        double[] array = new double[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");

        for (int i=0; i < array.length; i++){
            System.out.print("Element [" + i + "]= ");
            array[i] = scanner.nextDouble();
        }

        double maxElement = array[0];
        for (int i = 1; i < array.length; i++){
            if (maxElement < array[i]){
                maxElement = array[i];
            }
        }

        System.out.println("The biggest element in the array is with value " + maxElement);
    }

    public static void reverseLinkedList() {

        LinkedList <String> linkedList1 = new LinkedList <String> ();

        linkedList1.add("correctly");
        linkedList1.add("reversed");
        linkedList1.add("are");
        linkedList1.add("elements");
        linkedList1.add("The");

        System.out.println("The elements of the LinkedList are:" + "\n"
                            + linkedList1 + "\n");

        LinkedList <String> linkedList2 = new LinkedList <String> ();

        while (!linkedList1.isEmpty()){
            linkedList2.add(linkedList1.getLast());
            linkedList1.removeLast();
        }

        System.out.println("The elements of the reversed LinkedList are:" + "\n"
                + linkedList2);

    }

    public static void sumOfDiagonal() {

        double[][] array2D = {{1, 0.2, 0.33, 0.14}, {0.114, 2, 0.6, 0.133}, {0.155, 0.123, 3, 0.168}, {0.112, 0.233, 0.541, 4}};
        double[] arrayDiagonal = new double[4];

        for (int i = 0; i < 4; i++) {
            arrayDiagonal[i] = array2D[i][i];
        }

        double sumOfDiagonal = arrayDiagonal[0];
        for ( int i = 1; i < 4; i++) {
            sumOfDiagonal = sumOfDiagonal + arrayDiagonal[i];
        }

        System.out.println("The sum of the diagonal is: " + sumOfDiagonal);

    }

    public static void checkPalindrome() {

        String string;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        string = scanner.next();

        char[] array1 = string.toCharArray();
        char[] array2 = new char[array1.length];

        int j = (array1.length) - 1;
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[j];
            j--;
        }

        if (Arrays.equals(array1, array2)){
            System.out.println("The string '" + string + "' is a palindrome.");
        } else System.out.println("The string " + string + " is NOT a palindrome.");

    }
}
