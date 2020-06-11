import java.util.Scanner;
import static java.lang.System.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] tab = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tab[i][j] = scanner.nextInt();
            }
        }

        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = tab[(n - 1) - j][i];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                out.print(res[i][j] + " ");
            }
            out.println();
        }


        // put your code here
    }
}