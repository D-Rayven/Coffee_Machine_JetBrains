package machine;

import java.util.Scanner;
import static java.lang.System.*;

public class CoffeeMachine {
    
    public static void CoffeeMachine(int water, int milk, int coffeeBeans, int cups, int money) {
        
    }
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

        /*out.println("Write how many ml of water the coffee machine has:");
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
        }*/

        // Initial value of machine
        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int disposableCups = 9;
        int money = 550;

        boolean resume = true;

        while (resume) {
            out.println("Write action (buy, fill, take, remaining, exit) :");
            String action = scanner.nextLine();

            switch (action) {
                case "buy":
                    out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String choice = scanner.nextLine();

                    switch (choice) {
                        case "1":
                            if (water >= 250 && coffeeBeans >= 16) {
                                out.println("I have enough ressources, making you a coffee!");
                                water -= 250;
                                coffeeBeans -= 16;
                                money += 4;
                                disposableCups -= 1;
                            } else if (water < 250) {
                                out.println("Sorry, not enough water!");
                            } else {
                                out.println("Sorry, not enough coffee beans!");
                            }
                            break;
                        case "2":
                            if (water >= 350 && milk >= 75 && coffeeBeans >= 20) {
                                out.println("I have enough ressources, making you a coffee!");
                                water -= 350;
                                milk -= 75;
                                coffeeBeans -= 20;
                                money += 7;
                                disposableCups -= 1;
                            } else if (water < 350) {
                                out.println("Sorry, not enough water!");
                            } else if (milk < 75) {
                                out.println("Sorry, not enough milk!");
                            } else {
                                out.println("Sorry, not enough coffee beans!");
                            }
                            break;
                        case "3":
                            if (water >= 200 && milk >= 100 && coffeeBeans >= 12) {
                                out.println("I have enough ressources, making you a coffee!");
                                water -= 200;
                                milk -= 100;
                                coffeeBeans -= 12;
                                money += 6;
                                disposableCups -= 1;
                            } else if (water < 200) {
                                out.println("Sorry, not enough water!");
                            } else if (milk < 100) {
                                out.println("Sorry, not enough milk!");
                            } else {
                                out.println("Sorry, not enough coffee beans!");
                            }
                            break;
                        case "back":
                            continue;
                    }
                break;

            case "fill":
                out.println("Write how many ml of water do you want to add:");
                int waterAdd = scanner.nextInt();
                water += waterAdd;
                out.println("Write how many ml of milk do you want to add:");
                int milkAdd = scanner.nextInt();
                milk += milkAdd;
                out.println("Write how many grams of coffee beans do you want to add:");
                int coffeeBeansAdd = scanner.nextInt();
                coffeeBeans += coffeeBeansAdd;
                out.println("Write how many disposable cups of coffee do you want to add:");
                int cupsAdd = scanner.nextInt();
                disposableCups += cupsAdd;
                break;

            case "take":
                out.println("I gave you $" + money);
                money = 0;
                break;

            case "remaining":
                out.println("The coffee machine has:");
                out.println(water + " of water");
                out.println(milk + " of milk");
                out.println(coffeeBeans + " of coffee beans");
                out.println(disposableCups + " of disposable cups");
                out.println("$" + money + " of money");
                break;

            case "exit":
                resume = false;
                break;
            }
        }
    }
}

