public class MultiplyExample {

    // Instance method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Create an object of the class to call the instance method
        MultiplyExample obj = new MultiplyExample();

        // Call the multiply method with two integers
        int result = obj.multiply(4, 5);

        // Display the result
        System.out.println("Multiplication result: " + result);
    }
}
