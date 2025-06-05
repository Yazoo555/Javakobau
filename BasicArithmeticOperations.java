import java.util.Scanner;

public class BasicArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);

        if (num2 != 0) {
            double division = (double) num1 / num2;  // casting for decimal division
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: Cannot divide by zero");
        }

        scanner.close();
    }
}
