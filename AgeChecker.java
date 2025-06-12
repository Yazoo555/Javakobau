import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            scanner.close();
            return;
        }

        int oldest = Integer.MIN_VALUE;
        int youngest = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter age of person " + i + ": ");
            int age = scanner.nextInt();

            if (age < 0) {
                System.out.println("Age cannot be negative. Try again.");
                i--; // redo this iteration
                continue;
            }

            if (age > oldest) {
                oldest = age;
            }
            if (age < youngest) {
                youngest = age;
            }
        }

        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);

        scanner.close();
    }
}
