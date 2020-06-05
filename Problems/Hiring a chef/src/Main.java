//put imports you need here
import java.util.Scanner;
import static java.lang.System.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(in);

        String name = scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        String preference = scanner.nextLine();

        out.println("The form for " + name + " is completed. " +
                "We will contact you if we need a chef that cooks " + preference + " dishes.");
    }
}