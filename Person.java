// Person class (Base class)
public class Person {
    // Protected attribute, which can be accessed by subclasses and classes in the same package
    protected String address;

    // Constructor to initialize address
    public Person(String address) {
        this.address = address;
    }

    // Getter method for address
    public String getAddress() {
        return address;
    }

    // Method to display person details
    public void displayPersonDetails() {
        System.out.println("Address: " + address);
    }
}
