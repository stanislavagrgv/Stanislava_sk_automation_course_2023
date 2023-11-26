/*
package L07;

import java.io.FileWriter;
import java.util.Scanner;
public class FixThisCodeTryCatch {
    private static FileWriter getFileWriter(String filePath) {

        FileWriter fileWriter;

        try {
            fileWriter = new FileWriter(filePath, true);
        } catch (java.io.IOException e){
            System.out.println("Exception occured: " + e);
        }
        return fileWriter;
    }
    protected static void closeFileWriter(FileWriter fileWriter) {

        */
/*try { fileWriter.close();
    }*//*

    public static void printToFile(FileWriter fileWriter, String text, int repeat) {
        for (int i = 0; i < repeat; i++) {
            fileWriter.write(text + "\n");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        int howManyTimesToPrintTheTextToFile = scanner.nextInt();
        String textToAdd = scanner.nextLine();
        printToFile(getFileWriter(filePath), textToAdd, howManyTimesToPrintTheTextToFile);
    }
}
*/
