import java.util.Random;

public class drawBoard {

    public void draw() {
        int block = 3;
        int counter = 1;
        int rows = 9;
        int cols = 9;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                int num = fillBoard();
                if(j % block == 0 && j != 0) {
                    System.out.print("|"+num);
                } else {
                    System.out.print(num);
                }
            }
            if(counter == 3) {
                System.out.println();
                System.out.print("---+---+---");
                counter = 0;
            }
            counter++;
            System.out.println();
        }
    }

    public int fillBoard() {

        Random random = new Random();

        int randNum = random.nextInt(10);
       return randNum;
    }
}
