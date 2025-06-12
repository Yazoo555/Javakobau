import java.util.Scanner;

public class RectangleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking length input
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        
        // Taking breadth input
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        
        // Check if it's a square
        if (length == breadth) {
            System.out.println("The rectangle is actually a square.");
        } else {
            System.out.println("The rectangle is not a square.");
        }
        
        scanner.close();
    }
}
