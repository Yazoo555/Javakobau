public class Address {
    // Private attributes for encapsulation
    private String street;
    private String city;
    private String zipCode;

    // Constructor to initialize Address
    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    // Getter and Setter methods for street
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    // Getter and Setter methods for city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getter and Setter methods for zipCode
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    // Method to display the address
    public void displayAddress() {
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);
    }

    // Main method to test the Address class
    public static void main(String[] args) {
        // Creating an Address object
        Address myAddress = new Address("123 Main St", "New York", "10001");

        // Displaying initial address
        myAddress.displayAddress();

        // Modifying the address using setters
        myAddress.setStreet("456 Oak Ave");
        myAddress.setCity("Los Angeles");
        myAddress.setZipCode("90001");

        // Displaying updated address
        System.out.println("\nUpdated Address:");
        myAddress.displayAddress();
    }
}
