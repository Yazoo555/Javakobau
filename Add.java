public class Add {

    // Instance variables to store the two numbers
    private int num1;
    private int num2;

    // Default constructor that initializes the numbers
    public Add() {
        // Initialize the numbers with default values (e.g., 0 and 0)
        this.num1 = 0;
        this.num2 = 0;
    }

    // Method to set the values of the two numbers
    public void setNumbers(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    // Method to add the two numbers
    public int addNumbers() {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Create an instance of Add using the default constructor
        Add addOperation = new Add();

        // Set the numbers to be added
        addOperation.setNumbers(10, 20);

        // Perform the addition and print the result
        int result = addOperation.addNumbers();
        System.out.println("The sum is: " + result);
    }
}
