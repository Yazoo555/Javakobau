import java.util.Scanner;

public class TotalCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for quantity
        System.out.print("Enter the quantity of items: ");
        int quantity = scanner.nextInt();

        // Prompt user for price per item
        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        // Calculate total cost
        double totalCost = quantity * pricePerItem;

        // Display the total cost
        System.out.println("Total cost: " + totalCost);

        scanner.close();
    }
}
