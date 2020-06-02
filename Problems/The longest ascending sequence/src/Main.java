import java.util.Scanner;
import static java.lang.System.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int max = 0;
        int counter = 0;

        for (int j = 1; j < array.length; j++) {
            if (array[j] >= array[j - 1]) {
                counter++;
            } else {
                counter = 0;
            }

            if (counter > max) {
                max = counter;
            }
        }

        out.println(max + 1);
        // put your code here
    }
}