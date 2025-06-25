public class Add {

    // Instance variables to store the two numbers
    private int num1;
    private int num2;

    // Default constructor
    public Add() {
        // Initialize num1 and num2 with default values (0 in this case)
        num1 = 0;
        num2 = 0;
    }

    // Method to set the values of num1 and num2
    public void setNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Method to add the two numbers and return the result
    public int addNumbers() {
        return num1 + num2;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create an instance of Add using the default constructor
        Add addition = new Add();

        // Set numbers to be added
        addition.setNumbers(10, 20);

        // Add the numbers and display the result
        System.out.println("Sum: " + addition.addNumbers());
    }
}
