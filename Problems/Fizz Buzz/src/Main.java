import java.util.Scanner;
import static java.lang.System.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        int begin = scanner.nextInt();
        int end = scanner.nextInt();

        for (int i = begin; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                out.println("Fizz");
            } else if (i % 5 == 0) {
                out.println("Buzz");
            } else {
                out.println(i);
            }
        }
        // put your code here
    }
}