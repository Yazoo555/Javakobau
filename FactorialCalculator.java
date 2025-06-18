public class FactorialCalculator {

    // Static method to display factorial of a number
    public static void displayFactorial(int number) {
        long factorial = 1;
        
        // Calculating factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        // Display the factorial
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}


 