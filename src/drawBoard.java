import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
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
                        System.out.print("x");
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
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            nums.add(i);
        }

        Collections.shuffle(nums, random);

        for (int num : nums) {
            if(validPlace(board, row, col, num)) {
                return num;
            }
        }
        return 0;
    }

    public boolean validPlace(int[][] board, int row, int col, int num) {

        for(int c = 0; c < 9; c++) {
            if(board[row][c] == num) {
                return false;
            }
        }

        for(int r = 0; r < 9; r++) {
            if(board[r][col] == num) {
                return false;
            }
        }

        int check3x3ROW = (row / 3) * 3;
        int check3x3COL = (col / 3) * 3;

        for(int r = check3x3ROW; r < check3x3ROW + 3; r++) {
            for(int c = check3x3COL; c < check3x3COL + 3; c++) {
                if(board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }
    //TODO create recursive backtracking solving algorithm.

}
