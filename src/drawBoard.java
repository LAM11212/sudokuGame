import java.awt.*;
import java.util.Random;

public class drawBoard {


    public int[][] fillBoard() {
        int[][] board = new int[9][9];
        int counter = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = 0;
            }
        }
        return board;
    }

    public void draw(int[][] board) {

        int blockSize = 3;
        int filler = 1;
        int blankCounter = 0;

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                blankCounter++;
                if(j % blockSize == 0 && j != 0) {
                    System.out.print("|");
                }
                if(blankCounter == 5) {
                    board[i][j] = 0;
                    System.out.print("x");
                    blankCounter = 0;
                } else {
                    int val = isValid(board, i, j);
                    if(val != 0) {
                        board[i][j] = val;
                        System.out.print(val);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            if((i + 1) % blockSize == 0 && i != 8) {
                System.out.println();
                System.out.print("---+---+---");
            }
            System.out.println();
        }
    }

    public int isValid(int[][] board, int row, int col) {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }

}
