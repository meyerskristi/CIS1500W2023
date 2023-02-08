import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // ROCK PAPER SCISSORS

        String playersThrow = getPlayersThrow();
        String computersThrow = getComputersThrow();
        displayCountDownAndWinner(playersThrow, computersThrow);
    }

    private static void displayCountDownAndWinner(
            String playersThrow, String computersThrow) {
        System.out.println("Rock");
        System.out.println("Paper");
        System.out.println("Scissors");
        System.out.println("Shoot!");

        // TODO - fix this
        System.out.println("Player picked: " + playersThrow);

    }

    private static String getComputersThrow() {
        // TODO - DO THIS
        Random random = new Random();

        random.nextInt(1, 4); // gives 1-3
        // Math.random() * (upper bound exclusive - lowerbound) + lower bound
        int number1to3 = (int)(Math.random() * 3) + 1;

        if ( number1to3 == 1 ){

        }
        return "Rock";
    }

    private static String getPlayersThrow() {
        // TODO - DO THIS
        return "";
    }
}