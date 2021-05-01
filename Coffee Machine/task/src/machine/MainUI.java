package machine;

import java.util.*;

public class MainUI {
    int getAmountOfCoffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        return scanner.nextInt();
    }

    Hashtable<String, Integer> getIngredientLevel() {
        Scanner scanner = new Scanner(System.in);
        Hashtable<String, Integer> ingredientLevel = new Hashtable<String, Integer>();

        System.out.println("Write how many ml of water the coffee machine has:");
        ingredientLevel.put("water", scanner.nextInt());
        System.out.println("Write how many ml of milk the coffee machine has:");
        ingredientLevel.put("milk", scanner.nextInt());
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        ingredientLevel.put("beans", scanner.nextInt());
        return  ingredientLevel;
    }

    void printResult(int cups, int portionsInMachine) {
        if (portionsInMachine > cups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + pluralizeResult("cup", (portionsInMachine - cups)) + " more than that)");
        } else if (portionsInMachine == cups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (portionsInMachine == 0) {
            System.out.println("No, I can make only 0 cups of coffee");
        } else {
            System.out.println("No, I can make only " + pluralizeResult("cup", portionsInMachine) + " of coffee");
        }
    }

    public static String pluralizeResult(String word, int quantity) {
        StringBuilder sb = new StringBuilder();
        sb.append(quantity).append(" ").append(word);
        if (quantity > 1) {
            sb.append("s");
        }
        return String.valueOf(sb);
    }
}
