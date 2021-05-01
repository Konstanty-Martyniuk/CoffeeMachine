package machine;

import java.util.Scanner;

public
class CoffeeMachineParams {
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int disposableCups = 9;
    static int money = 550;

    void take() {
        System.out.println("I gave you $" + money);
        money = 0;
        System.out.println();
    }

    void printCoffeeMachineState() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + money + " of money");
        System.out.println();
    }

     void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        beans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        disposableCups += scanner.nextInt();
        System.out.println();
    }

    void buy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        int choice;
        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            choice = 0;
        }
        switch (choice) {
            case 1: if (enoughIngredients(250, 0, 16, 1)) {
                    makeCoffee(250, 0, 16, 4);
                    }
                    break;
            case 2: if (enoughIngredients(350, 75, 20, 1)) {
                    makeCoffee(350, 75, 20, 7);
                    }
                    break;
            case 3: if (enoughIngredients(200, 100, 12, 1)) {
                    makeCoffee(200, 100, 12, 6);
                    }
                    break;
            default: return;
        }
    }

    boolean enoughIngredients(int water, int milk, int beans, int cups) {
        if (water > CoffeeMachineParams.water) {
            System.out.println("Sorry, not enough water!");
            return false;
        } else if (milk > CoffeeMachineParams.milk) {
            System.out.println("Sorry, not enough milk!");
            return false;
        } else if (beans > CoffeeMachineParams.beans) {
            System.out.println("Sorry, not enough beans!");
            return false;
        } else if (cups > CoffeeMachineParams.disposableCups) {
            System.out.println("Sorry, not enough disposable cups!");
            return false;
        }
        return true;
    }

    public void makeCoffee(int water, int milk, int beans, int price) {
            System.out.println("I have enough resources, making you a coffee!");
            this.water -= water;
            this.milk -= milk;
            this.beans -= beans;
            this.money += price;
            this.disposableCups--;
    }
}
