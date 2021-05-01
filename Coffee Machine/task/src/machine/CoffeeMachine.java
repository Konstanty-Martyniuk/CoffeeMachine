package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        CoffeeMachineParams machine = new CoffeeMachineParams();
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();
            switch (action) {
                case "fill": machine.fill();
                    break;
                case "take": machine.take();
                    break;
                case "buy": machine.buy();
                    break;
                case "remaining": machine.printCoffeeMachineState();
                    break;
                case "exit": return;
            }
            System.out.println();
        }
    }
}