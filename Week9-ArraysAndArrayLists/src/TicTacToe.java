import java.lang.reflect.Array;
import java.util.ArrayList;

public class TicTacToe {

    private final char EMPTY = ' ';
    private final char X = 'X';
    private final char O = 'O';

    private char currentPlayer;
    private ArrayList<ArrayList<Character>> board;

    public TicTacToe() {
        currentPlayer = 'X';
        board = new ArrayList<>();

        for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
            // adds an empty row
            board.add(new ArrayList<>());
            for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
                // gets the row at the rowIndex, and adds a ' '
                board.get(rowIndex).add(EMPTY);
            }
        }
    }

    @Override
    public String toString(){
        String result = "";
        for(ArrayList<Character> row : board){
            result += row.toString() + "\n";
        }
        return result;
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    private boolean someoneWonByRow() {
        for (ArrayList<Character> row : board) {
            if (row.get(0) != EMPTY
                    && row.get(0) == row.get(1)
                    && row.get(0) == row.get(2)) {
                return true;
            }
        }
        return false;
    }

    private boolean someoneWonByColumn() {
        for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
            if (board.get(0).get(columnIndex) != EMPTY
                    && board.get(0).get(columnIndex) == board.get(1).get(columnIndex)
                    && board.get(0).get(columnIndex) == board.get(2).get(columnIndex)) {
                return true;
            }
        }
        return false;
    }

    private boolean someoneWonByDiagonal() {
        return board.get(1).get(1) != EMPTY && (
            ( board.get(1).get(1) == board.get(0).get(0) && (board.get(1).get(1) == board.get(2).get(2)))
            || (board.get(1).get(1) == board.get(2).get(0) && (board.get(1).get(1) == board.get(0).get(2)))
            );
    }

    public boolean someoneWon() {
        return someoneWonByRow() || someoneWonByColumn() || someoneWonByDiagonal();
    }

    public boolean isTied() {
        if (someoneWon()) {
            return false;
        }
        for (ArrayList<Character> row : board) {
            for (char mark : row) {
                if (mark == EMPTY) {
                    return false;
                }
            }
        }
        // if it didn't find an empty space
        return true;
    }

    public boolean isGameOver() {
        return isTied() || someoneWon();
    }

    public boolean mark(int rowIndex, int columnIndex) {
        if (rowIndex < 0 || rowIndex >= 3 || columnIndex < 0 || columnIndex >= 3
                || board.get(rowIndex).get(columnIndex) != EMPTY) {
            return false;
        }
        // board[rowIndex][columnIndex] = currentPlayer;
        board.get(rowIndex).set(columnIndex, currentPlayer);

        if (currentPlayer == X) {
            currentPlayer = O;
        } else {
            currentPlayer = X;
        }

        // currentPlayer = currentPlayer == X ? O : X;

        return true;
    }
}
