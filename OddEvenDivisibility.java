import java.util.Scanner;

public class OddEvenDivisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) { // even
            System.out.println(number + " is even.");
            if (number % 4 == 0) {
                System.out.println(number + " is divisible by 4.");
            } else {
                System.out.println(number + " is not divisible by 4.");
            }
        } else { // odd
            System.out.println(number + " is odd.");
            if (number % 7 == 0) {
                System.out.println(number + " is divisible by 7.");
            } else {
                System.out.println(number + " is not divisible by 7.");
            }
        }

        scanner.close();
    }
}
