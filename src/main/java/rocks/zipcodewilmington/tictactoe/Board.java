package rocks.zipcodewilmington.tictactoe;

import java.util.ArrayList;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] board;
    String row1;
    String row2;
    String row3;
    String col1;
    String col2;
    String col3;
    String dig1;
    String dig2;

    ArrayList<String> lines;


    public Board(Character[][] matrix) {
        this.board = matrix;
        row1 = board[0][0].toString() + board[0][1].toString() + board[0][2].toString();
        row2 = board[1][0].toString();
        board[1][1].toString();
        board[1][2].toString();
        row3 = board[2][0].toString();
        board[2][1].toString();
        board[2][2].toString();

        col1 = board[0][0].toString() + board[1][0].toString() + board[2][0].toString();
        col2 = board[0][1].toString() + board[1][1].toString() + board[2][1].toString();
        col3 = board[0][2].toString() + board[1][2].toString() + board[2][2].toString();

        dig1 = board[0][0].toString() + board[1][1].toString() + board[2][2].toString();
        dig2 = board[0][2].toString() + board[1][1].toString() + board[2][0].toString();

        ArrayList<String> lines = new ArrayList<String>();

        lines.add(row1);
        lines.add(row2);
        lines.add(row3);
        lines.add(col1);
        lines.add(col2);
        lines.add(col3);
        lines.add(dig1);
        lines.add(dig2);
    }

    public Boolean isInFavorOfX() {
        for (int x = 0; x < lines.size(); x++) {
            if (lines.get(x).equals("XXX"))
                return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        for (int x = 0; x < lines.size(); x++) {
            if (lines.get(x).equals("OOO"))
                return false;
        }
        return true;
    }

        public Boolean isTie() {
            for (int x = 0; x < lines.size(); x++) {
                if (lines.get(x).equals("XXX"))   {
                    return false;
                }
                else if (lines.get(x).equals("OOO")){
                    return false;
                }
            }
            return  true;
        }

            public String getWinner() {
                for (int x = 0; x < lines.size(); x++) {
                    if (lines.get(x).equals("XXX")) {
                        return "X";

                    } else if (lines.get(x).equals(("OOO"))) {

                        return "O";

                    }

                }
                return "";
            }
}






