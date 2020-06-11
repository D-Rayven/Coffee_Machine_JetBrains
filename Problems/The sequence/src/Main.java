import java.util.Scanner;
import static java.lang.System.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        int tmp = 0;
        int max = 0;

        while (scanner.hasNext()) {
            tmp = scanner.nextInt();

            if (tmp > max) {
                if (tmp % 4 == 0) {
                    max = tmp;
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }

        out.println(max);
        // put your code here
    }
}