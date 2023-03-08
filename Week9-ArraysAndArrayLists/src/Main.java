import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // array of type int, called numbers, with slots for 6 ints
        int[] numbers = new int[6];

        // x23F9

        // always start with index 0
        numbers[0] = 7; // x23F9
        numbers[1] = 13; // x23FD
        numbers[2] = 17; // x2401
        numbers[3] = 23; // x2405
        numbers[4] = 29; // x2409
        numbers[5] = 31; // x240D

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many test scores do you have to enter?");

        int numberOfScores = Integer.parseInt(keyboard.nextLine());

        int[] testScores = new int[numberOfScores];

        for ( int index = 0; index < testScores.length; index++){
            System.out.println("Enter score #" + index);
            testScores[index] = Integer.parseInt(keyboard.nextLine());
        }

        for ( int index = 0; index < testScores.length; index++){
            System.out.println("score #" + index + ": " + testScores[index]);
        }

        double total = 0;

        // just prints the scores without the score #
        for ( int value : testScores){
            total += value;
        }

        double average = total / testScores.length;

        System.out.println("Average score: " + average);


    }
}