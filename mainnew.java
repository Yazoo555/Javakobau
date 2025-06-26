// Main class to test Parent and Child classes
public class mainnew {
    public static void main(String[] args) {
        // Creating an instance of the Child class
        Child child = new Child("Private Data", "Protected Data", "Public Data");

        // Displaying the variables (we cannot access privateVar from Child, so we use the method to demonstrate access)
        child.demonstrateAccess();
    }
}
