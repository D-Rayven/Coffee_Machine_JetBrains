import java.util.Scanner;

import static java.lang.System.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        out.println(k % n);
        // put your code here
    }
}