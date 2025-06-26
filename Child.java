// Child class (subclass of Parent)
public class Child extends Parent {
    
    // Constructor for Child class
    public Child(String privateVar, String protectedVar, String publicVar) {
        // Calling the parent class constructor
        super(privateVar, protectedVar, publicVar);
    }

    // Method to demonstrate accessing the variables
    public void demonstrateAccess() {
        // Trying to access all variables in the parent class
        
        // privateVar is not accessible because it is private to the Parent class
        // System.out.println("Private Variable: " + privateVar); // This will cause a compile-time error
        
        // protectedVar is accessible because it is protected in the Parent class
        System.out.println("Protected Variable: " + protectedVar);

        // publicVar is accessible because it is public in the Parent class
        System.out.println("Public Variable: " + publicVar);
    }
}
