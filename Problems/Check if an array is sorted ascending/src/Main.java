import java.util.Scanner;
import static java.lang.System.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        boolean ordered = true;
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int j = 1; j < array.length; j++) {
            if (array[j] < array[j - 1]) {
                ordered = false;
                break;
            }
        }

        if (ordered) {
            out.println("true");
        } else {
            out.println("false");
        }
        // put your code here
    }
}