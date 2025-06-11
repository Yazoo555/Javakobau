import java.util.Scanner;

public class MaxOfTwoUsingSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        // Calculate comparison result (1 if number1 > number2, -1 if number2 > number1, 0 if equal)
        int comparisonResult;
        if (number1 > number2) {
            comparisonResult = 1;
        } else if (number1 < number2) {
            comparisonResult = -1;
        } else {
            comparisonResult = 0;
        }

        // Use switch statement to determine maximum
        switch (comparisonResult) {
            case 1:
                System.out.println("Maximum: " + number1);
                break;
            case -1:
                System.out.println("Maximum: " + number2);
                break;
            case 0:
                System.out.println("Both numbers are equal: " + number1);
                break;
            default:
                System.out.println("Unexpected comparison result.");
        }

        scanner.close();
    }
}
