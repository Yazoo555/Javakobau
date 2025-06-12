import java.util.Scanner;

public class OddEvenSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        switch (number % 2) {
            case 0:
                System.out.println(number + " is even.");
                break;
            case 1:
            case -1: // in case of negative odd numbers
                System.out.println(number + " is odd.");
                break;
            default:
                System.out.println("Unexpected case.");
        }

        scanner.close();
    }
}
