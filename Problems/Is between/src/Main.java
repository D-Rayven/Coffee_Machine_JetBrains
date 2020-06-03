import java.util.Scanner;
import static java.lang.System.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        if (first >= second && first <= third || first <= second && first >= third) {
            out.println("true");
        } else {
            out.println("false");
        }
        // put your code here
    }
}