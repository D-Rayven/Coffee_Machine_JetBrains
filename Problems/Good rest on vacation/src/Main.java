import java.util.Scanner;
import static java.lang.System.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        int day = scanner.nextInt();
        int food = scanner.nextInt();
        int flight = scanner.nextInt();
        int night = scanner.nextInt();

        int total = food * day + flight * 2 + night * (day - 1);
        out.print(total);
        // put your code here
    }
}