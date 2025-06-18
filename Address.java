public class Address {

    // Private attributes
    private String street;
    private String city;
    private String zipCode;

    // Constructor to initialize Address object
    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    // Getter for street
    public String getStreet() {
        return street;
    }

    // Setter for street
    public void setStreet(String street) {
        this.street = street;
    }

    // Getter for city
    public String getCity() {
        return city;
    }

    // Setter for city
    public void setCity(String city) {
        this.city = city;
    }

    // Getter for zipCode
    public String getZipCode() {
        return zipCode;
    }

    // Setter for zipCode
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    // Method to display the address in a formatted way
    public void displayAddress() {
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);
    }

    // Main method to test the Address class
    public static void main(String[] args) {
        // Create an Address object
        Address address = new Address("123 Elm Street", "Springfield", "98765");

        // Display the address using displayAddress method
        address.displayAddress();

        // Modify the address using setter methods
        address.setStreet("456 Oak Avenue");
        address.setCity("Greenwood");
        address.setZipCode("12345");

        // Display the updated address
        System.out.println("\nUpdated Address:");
        address.displayAddress();
    }
}
