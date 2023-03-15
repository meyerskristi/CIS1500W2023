import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // open the file - careful, it will erase what was in there

        // FileWriter fileWriter = new FileWriter("test.txt");
        //              when using FileWriter use a second argument of true to append

        // PrintWriter printWriter = new PrintWriter(new FileWriter("test.txt", true));

        // full path to a file
        // PrintWriter printWriter = new PrintWriter(new FileWriter("c:/temp/test.txt"));

        // will create directory if it doesn't exist
        File logDirectory = new File("logs");
        logDirectory.mkdirs();

        // writes to the file in the logs directory
        PrintWriter printWriter = new PrintWriter(new FileWriter("logs/test.txt"));


        // read or write to the files
        //fileWriter.write("hello world!");
        //fileWriter.write("\nHappy Tuesday!");

        printWriter.println("Hello world!");
        printWriter.println("Happy Tuesday!");

        // close the file
        printWriter.close();


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of a file to read");
        String fileName = keyboard.nextLine();

        File fileToRead = new File(fileName);

        while ( !fileToRead.exists() ){
            System.out.println("That file doesn't exist, please try again");
            fileName = keyboard.nextLine();
            fileToRead = new File(fileName);
        }

        Scanner fileReader = new Scanner(fileToRead);

        double total = 0;
        while ( fileReader.hasNext() ){
            String line = fileReader.nextLine();
            double value = Double.parseDouble(line);
            total += value;
        }

        System.out.println("Total value of numbers in file is: " + total);


    }
}