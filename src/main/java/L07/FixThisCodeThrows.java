/*
package L07;

import java.io.FileWriter;
import java.util.Scanner;
public class FixThisCode {
    private static FileWriter getFileWriter(String filePath) {
        FileWriter fileWriter = new FileWriter(filePath, true);
        return fileWriter;
    }
    protected static void closeFileWriter(FileWriter fileWriter) {
        fileWriter.close();
    }
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
