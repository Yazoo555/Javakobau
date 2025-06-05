import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in U.S. dollars: ");
        double dollars = scanner.nextDouble();

        System.out.print("Enter the exchange rate (1 USD to target currency): ");
        double exchangeRate = scanner.nextDouble();

        double convertedAmount = dollars * exchangeRate;

        System.out.println("Converted amount: " + convertedAmount);

        scanner.close();
    }
}
