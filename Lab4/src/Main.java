import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //https://www.asciiart.eu/plants/roses
        System.out.println(
                """
                                     __
                                _   / /|
                               |\\\\  \\/_/
                               \\_\\| / __             \s
                                  \\/_/__\\           .-=='/~\\
                           ____,__/__,_____,______)/   /{~}}}
                           -,------,----,-----,---,\\'-' {{~}}
                        jgs                         '-==.\\}/                        
                        """
        );
        // ROCK PAPER SCISSORS

        String playAgain = "Y";

        while ( playAgain.equalsIgnoreCase("Y")) {

            String playersThrow = getPlayersThrow();
            String computersThrow = getComputersThrow();
            displayCountDownAndWinner(playersThrow, computersThrow);

            System.out.println("Do you want to play again (y/n)");
            playAgain= keyboard.nextLine();
        }
    }

    private static void displayCountDownAndWinner(
            String playersThrow, String computersThrow) {
        System.out.println("Rock");
        System.out.println("Paper");
        System.out.println("Scissors");
        System.out.println("Shoot!");

        System.out.println("Player picked: " + playersThrow);
        System.out.println("Computer picked: " + computersThrow);

        if ( playersThrow.equalsIgnoreCase(computersThrow)){
            System.out.println("Draw!");
        } else if ( ( playersThrow.equalsIgnoreCase("Rock") && computersThrow.equalsIgnoreCase("Scissors") ) ||
                ( playersThrow.equalsIgnoreCase("Paper") && computersThrow.equalsIgnoreCase("Rock") ) ||
                ( playersThrow.equalsIgnoreCase("Scissors") && computersThrow.equalsIgnoreCase("Paper") ) ){
            System.out.println("You win!");
        } else{
            System.out.println("You lose!");
        }

    }

    private static String getComputersThrow() {
        // TODO - DO THIS
        Random random = new Random();

        int number1to3 = random.nextInt(1, 4); // gives 1-3
        // Math.random() * (upper bound exclusive - lowerbound) + lower bound
        //int number1to3 = (int)(Math.random() * 3) + 1;

        if ( number1to3 == 1 ){
            return "Rock";
        } else if ( number1to3 == 2 ){
            return "Paper";
        } else {
            return "Scissors";
        }

    }

    private static String getPlayersThrow() {
        Scanner keyboard = new Scanner(System.in);

        String playerThrow = "";

        while ( !playerThrow.equalsIgnoreCase("Rock") && !playerThrow.equalsIgnoreCase("Paper")
        && !playerThrow.equalsIgnoreCase("Scissors")){
            System.out.println("Enter Rock Paper or Scissors");
            playerThrow = keyboard.nextLine();
        }
        return playerThrow;
    }
}