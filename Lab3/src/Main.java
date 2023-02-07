import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double totalScore = 0;
        int numberOfTests = -1;

        double score = 0;

        while ( score != -1 ){
            totalScore += score;

            System.out.println("Enter a test score or -1 to stop");
            score = Double.parseDouble(keyboard.nextLine());
            // if ( score != -1 )
            numberOfTests++;
        }

        System.out.println("The average test score is: " + ( totalScore / numberOfTests));


        System.out.println("How many tests do you have to enter?");
        int testsToEnter = Integer.parseInt(keyboard.nextLine());

        double sumOfScores = 0;

        for ( int testNumber = 0; testNumber < testsToEnter; testNumber++ ){
            System.out.println("Enter a test score");
            score = Double.parseDouble(keyboard.nextLine());
            sumOfScores += score;
        }

        System.out.println("The average test score is: " + ( sumOfScores / testsToEnter));



    }
}