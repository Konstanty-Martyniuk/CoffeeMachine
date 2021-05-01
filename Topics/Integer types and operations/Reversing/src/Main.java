import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a;
        int b;
        int c;
        a = number % 10 * 100;
        b = (number / 10) % 10 * 10;
        c = number / 100 % 10;

        System.out.println(a + b + c);
    }
}