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



    }
}