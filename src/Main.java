import java.util.*;
public class Main {
    public static void main(String[] args) {

        drawBoard drawing = new drawBoard();

        int[][] board = drawing.fillBoard();
        drawing.draw(board);



    }
}