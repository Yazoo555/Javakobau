import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks from user
        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();

        // Determine grade based on marks
        if (marks >= 40 && marks < 50) {
            System.out.println("Grade: C");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Grade: C+");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade: B");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade: B+");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade: A");
        } else if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A+");
        } else {
            System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
        }

        scanner.close();
    }
}
