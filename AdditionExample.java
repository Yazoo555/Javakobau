public class AdditionExample {

    // Static method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Call the static method directly without creating an object
        int result = add(10, 20);

        // Display the result
        System.out.println("Addition result: " + result);
    }
}
