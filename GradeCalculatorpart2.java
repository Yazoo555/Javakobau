import java.util.Scanner;

public class GradeCalculatorpart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for five subjects
        System.out.print("Enter marks for Physics: ");
        double physics = scanner.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = scanner.nextDouble();

        System.out.print("Enter marks for Biology: ");
        double biology = scanner.nextDouble();

        System.out.print("Enter marks for Mathematics: ");
        double mathematics = scanner.nextDouble();

        System.out.print("Enter marks for Computer: ");
        double computer = scanner.nextDouble();

        // Calculate total and percentage
        double total = physics + chemistry + biology + mathematics + computer;
        double percentage = (total / 500) * 100;

        System.out.printf("Percentage: %.2f%%\n", percentage);

        // Determine grade
        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else if (percentage >= 40) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }

        scanner.close();
    }
}
