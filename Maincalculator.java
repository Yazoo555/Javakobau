// Calculator class definition
class Calculator {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three doubles
    public double add(double a, double b, double c) {
        return a + b + c;
    }
}

public class Maincalculator {
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Add two integers
        int sumInt = calculator.add(5, 8);
        System.out.println("Sum of two integers: " + sumInt);

        // Add three integers
        int sumInt3 = calculator.add(10, 15, 20);
        System.out.println("Sum of three integers: " + sumInt3);

        // Add two doubles
        double sumDouble = calculator.add(3.5, 2.7);
        System.out.println("Sum of two doubles: " + sumDouble);

        // Add three doubles
        double sumDouble3 = calculator.add(1.1, 2.2, 3.3);
        System.out.println("Sum of three doubles: " + sumDouble3);
    }
}
