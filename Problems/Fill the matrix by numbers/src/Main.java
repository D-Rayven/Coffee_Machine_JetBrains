import static java.lang.System.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        int n = scanner.nextInt();

        int[][] tab = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tab[i][j] = Math.abs(i - j);
            }
        }

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                out.print(tab[x][y] + " ");
            }
            out.println();
        }
        // put your code here
    }
}