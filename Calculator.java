public class Calculator {

    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Add three doubles
    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Add two integers
        int sum2Int = calc.add(5, 8);
        System.out.println("Sum of 2 integers: " + sum2Int);

        // Add three integers
        int sum3Int = calc.add(10, 15, 20);
        System.out.println("Sum of 3 integers: " + sum3Int);

        // Add two doubles
        double sum2Double = calc.add(3.5, 2.7);
        System.out.println("Sum of 2 doubles: " + sum2Double);

        // Add three doubles
        double sum3Double = calc.add(1.1, 2.2, 3.3);
        System.out.println("Sum of 3 doubles: " + sum3Double);
    }
}
