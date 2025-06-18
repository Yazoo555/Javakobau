public class MultiplicationExample {

    // Instance method to multiply two integers
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        // Creating an instance of the class to call the instance method
        MultiplicationExample example = new MultiplicationExample();
        
        // Calling the multiply method and storing the result
        int result = example.multiply(5, 10); // Example with 5 and 10
        
        // Output the result
        System.out.println("The result of multiplication is: " + result);
    }
}
