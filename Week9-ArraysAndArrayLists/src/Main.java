import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        TicTacToe game = new TicTacToe();

        while( !game.isGameOver()){
            System.out.println(game);

            System.out.println(game.getCurrentPlayer() + "'s turn");

            System.out.println("What row index? 0-2 ");
            int rowIndex = Integer.parseInt(keyboard.nextLine());

            System.out.println("What column index? 0-2 ");
            int columnIndex = Integer.parseInt(keyboard.nextLine());

            if ( !game.mark(rowIndex, columnIndex)){
                System.out.println("Invalid, try again");
            }

        }

        System.out.println("Game over!");
        System.out.println(game);


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

        // shortcut for creating arrays with known values
        int[] otherNumbers = { 2, 4, 6, 8};

        // NOT A COPY - two variables pointed at the same array in memory
        int[] copyOtherNumbers = otherNumbers;



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

        ArrayList<Integer> arrayListOfNumbers = new ArrayList<>();

        System.out.println("Enter the number of deposits you have");
        int numberOfDeposits = Integer.parseInt(keyboard.nextLine());

        for ( int index = 0; index < numberOfDeposits; index++){
            System.out.println("Enter deposit #" + index);
            arrayListOfNumbers.add(Integer.parseInt(keyboard.nextLine()));
        }

        System.out.println(arrayListOfNumbers);

        for( int index = 0; index < arrayListOfNumbers.size(); index++){
            System.out.println("Deposit #" + index + ": " + arrayListOfNumbers.get(index));
        }

        // first value is the largest until we know otherwise
        int largestNumber = arrayListOfNumbers.get(0);

        for ( int value : arrayListOfNumbers ){
            if ( value > largestNumber){
                largestNumber = value;
            }
        }

        System.out.println("Largest deposit is: " + largestNumber);

        int[][] twoDimensionalNumbers = new int[3][3];

        int[][][] threeDimensionalNonsense = new int[3][3][3];

        // [1, 2, 3], [4, 5, 6], [7, 8, 9]

        // [1, 2, 3],
        // [4, 5, 6],
        // [7, 8, 9]

        char[][] board = new char[3][3];

        // [row][column]
        board[0][0] = ' ';
        board[0][1] = ' ';
        board[0][2] = ' ';

        board[1][0] = ' ';
        board[1][1] = ' ';
        board[1][2] = ' ';

        board[2][0] = ' ';
        board[2][1] = ' ';
        board[2][2] = ' ';

        for( int rowIndex = 0; rowIndex < board.length; rowIndex++){
            for( int columnIndex = 0; columnIndex < board[rowIndex].length; columnIndex++){
                board[rowIndex][columnIndex] = ' ';
            }
        }

        // starts empty
        ArrayList<ArrayList<Character>> arrayListBoard = new ArrayList<>();

        for ( int rowIndex = 0; rowIndex < 3; rowIndex++){
            // adds an empty row
            arrayListBoard.add( new ArrayList<>());
            for ( int columnIndex = 0; columnIndex < 3; columnIndex++){
                // gets the row at the rowIndex, and adds a ' '
                arrayListBoard.get(rowIndex).add(' ');
            }
        }

        System.out.println(arrayListBoard);

    }
}