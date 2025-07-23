public class Add {
    int num1;
    int num2;
    int sum;

    // Default constructor
    public Add() {
        // Initialize numbers
        num1 = 10;
        num2 = 20;

        // Perform addition
        sum = num1 + num2;
    }

    // Method to display the result
    public void display() {
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        // Create object of class Add (default constructor is called)
        Add obj = new Add();

        // Call method to display result
        obj.display();
    }
}
