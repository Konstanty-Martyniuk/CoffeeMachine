import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int costsOfFoodPerDay = scanner.nextInt();
        int ticket = scanner.nextInt();
        int costOfOneNightInHotel = scanner.nextInt();
        System.out.println(days * costsOfFoodPerDay + ticket * 2 + (days - 1) * costOfOneNightInHotel);
    }
}