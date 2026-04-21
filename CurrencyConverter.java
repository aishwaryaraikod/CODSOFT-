import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base currency (INR/USD/EUR): ");
        String from = sc.next().toUpperCase();

        System.out.print("Enter target currency (INR/USD/EUR): ");
        String to = sc.next().toUpperCase();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double rate = 0;

        // Conversion rates
        if (from.equals("INR") && to.equals("USD")) rate = 0.012;
        else if (from.equals("USD") && to.equals("INR")) rate = 83;
        else if (from.equals("INR") && to.equals("EUR")) rate = 0.011;
        else if (from.equals("EUR") && to.equals("INR")) rate = 90;
        else if (from.equals("USD") && to.equals("EUR")) rate = 0.92;
        else if (from.equals("EUR") && to.equals("USD")) rate = 1.08;
        else {
            System.out.println("Invalid currency!");
            return;
        }

        double result = amount * rate;

        System.out.println("Converted Amount: " + result + " " + to);
    }
}