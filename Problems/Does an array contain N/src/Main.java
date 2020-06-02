import java.util.Scanner;
import static java.lang.System.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        boolean exist = false;
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();

        for (int j : array) {
            if (j == x) {
                exist = true;
                break;
            }
        }
        if (exist) {
            out.println("true");
        } else {
            out.println("false");
        }
        // put your code here
    }
}