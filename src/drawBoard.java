import java.util.Random;

public class drawBoard {

    public static int[][] board = new int[9][9];

    public void fillBoard() {
        int counter = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = 0;
            }
        }
    }

    public void draw() {

        int blockSize = 3;
        int filler = 0;

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(j % blockSize == 0 && j != 0) {
                    System.out.print("|");
                }
                System.out.print(filler);
            }
            if(i % blockSize == 2) {
                System.out.println();
                System.out.print("---+---+---");
            }
            System.out.println();
        }
    }

    public boolean isValid() {
        //TODO implement method to check if the individual block contains the filler, and if it does replace it w/ a valid num
        return false;
    }

}
