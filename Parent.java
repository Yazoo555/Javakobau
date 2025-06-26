// Parent class
public class Parent {
    // Private variable - only accessible within this class
    private String privateVar;

    // Protected variable - accessible within this class and subclasses
    protected String protectedVar;

    // Public variable - accessible anywhere
    public String publicVar;

    // Constructor to initialize variables
    public Parent(String privateVar, String protectedVar, String publicVar) {
        this.privateVar = privateVar;
        this.protectedVar = protectedVar;
        this.publicVar = publicVar;
    }

    // Method to display the variables (for testing purposes)
    public void displayVariables() {
        System.out.println("Private Variable: " + privateVar);
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Public Variable: " + publicVar);
    }
}
