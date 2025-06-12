import java.util.Scanner;

public class ExamEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you have a medical cause? (y/n): ");
        char response = scanner.next().charAt(0);

        if (response == 'y' || response == 'Y') {
            System.out.println("You are not allowed to sit in the exam.");
        } else if (response == 'n' || response == 'N') {
            System.out.println("You can sit in the exam.");
        } else {
            System.out.println("Invalid input. Please enter 'y' or 'n'.");
        }

        scanner.close();
    }
}
