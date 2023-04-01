import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int[][] minefield = new int[2][2]; // campo minado

        int line;
        int column;
        

        // Gera um numero aleatório entre 0 e 1
        int x = rand.nextInt(2);
        int y = rand.nextInt(2);

        minefield[x][y] = 1;

        for (int i = 0; i < minefield.length; i++) {
            for (int j = 0; j < minefield[i].length; j++) {
                System.out.println("Put X");
                line = input.nextInt();
                System.out.println("Put Y");
                column = input.nextInt();

                if (minefield[line][column] == 0) {
                    System.out.println("Right, write other number");
                    break;
                } else {
                    System.out.println("Booom! You are death");
                }
            }
        }
    }
}
