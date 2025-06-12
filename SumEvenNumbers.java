import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int count = 0;  // counts how many even numbers summed so far
        int number = 2; // first even number
        int sum = 0;

        while (count < n) {
            sum += number;
            number += 2;  // move to the next even number
            count++;
        }

        System.out.println("Sum of first " + n + " even numbers is: " + sum);

        scanner.close();
    }
}
