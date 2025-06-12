import java.util.Scanner;

public class OddEvenSwitchWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter numbers to check odd/even (enter 0 to exit):");

        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Exiting program.");
                break;
            }

            switch (number % 2) {
                case 0:
                    System.out.println(number + " is even.");
                    break;
                case 1:
                case -1:
                    System.out.println(number + " is odd.");
                    break;
                default:
                    System.out.println("Unexpected case.");
            }
        }

        scanner.close();
    }
}
