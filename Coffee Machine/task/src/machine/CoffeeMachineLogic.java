package machine;

import java.util.Hashtable;

public
class CoffeeMachineLogic {
    static final int WATER_PER_PORTION = 200;
    static final int MILK_PER_PORTION = 50;
    static final int COFFEE_BEANS_PER_PORTION = 15;

    public static void calculateIngredients(int cups) {
        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println(WATER_PER_PORTION * cups + " ml of water");
        System.out.println(MILK_PER_PORTION * cups + " ml of milk");
        System.out.println(COFFEE_BEANS_PER_PORTION * cups + " g of coffee beans");
    }

    public static int calculateAmountOfCups(Hashtable<String, Integer> coffeeMachineParams) {
        int water = coffeeMachineParams.get("water") / WATER_PER_PORTION;
        int milk = coffeeMachineParams.get("milk") / MILK_PER_PORTION;
        int beans = coffeeMachineParams.get("beans") / COFFEE_BEANS_PER_PORTION;

        return Math.min(water, Math.min(milk, beans));
    }
}
