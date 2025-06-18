public class MathOperations {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        // Testing the addition of two integers
        int sumInt = mathOps.add(5, 10);
        System.out.println("Sum of 5 and 10 (integers): " + sumInt);

        // Testing the addition of two doubles
        double sumDouble = mathOps.add(5.5, 10.3);
        System.out.println("Sum of 5.5 and 10.3 (doubles): " + sumDouble);

        // Testing the addition of three integers
        int sumThreeInt = mathOps.add(3, 6, 9);
        System.out.println("Sum of 3, 6, and 9 (three integers): " + sumThreeInt);
    }
}
