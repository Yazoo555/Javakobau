// Customer.java
public class Customer {
    protected String firstName;
    protected String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + firstName + " " + lastName);
    }
}


