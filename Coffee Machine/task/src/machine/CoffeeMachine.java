package machine;

import java.util.Scanner;
import static java.lang.System.*;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        /*out.println("Starting to make a coffee");
        out.println("Grinding coffee beans");
        out.println("Boiling water");
        out.println("Mixing boiled water with crushed coffee beans");
        out.println("Pouring coffee into the cup");
        out.println("Pouring some milk into the cup");
        out.println("Coffee is ready!");

        out.println("Write how many cups of coffee you will need:");
        int nbCups = scanner.nextInt();
        out.println("For " + nbCups + " of coffee you will need:");
        out.println(nbCups * 200 + " ml of water");
        out.println(nbCups * 50 + " ml of milk");
        out.println(nbCups * 15 + " g of coffee beans");*/

        out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeBeans = scanner.nextInt();
        out.println("Write how many cups of coffee you will need:");
        int nbCups = scanner.nextInt();

        int nbCupsPossible = Math.min(Math.min(water / 200, milk / 50), coffeeBeans / 15);

        if (nbCups * 200 > water || nbCups * 50 > milk || nbCups * 15 > coffeeBeans) {
            out.println("No, I can make only " + nbCupsPossible + " cup(s) of coffee");

        } else if (nbCupsPossible - nbCups > 0) {
            out.println("Yes, I can make that amount of coffee (and even " + (nbCupsPossible - nbCups) + " more than that)");
        } else {
            out.println("Yes, I can make that amount of coffee");
        }


    }
}
