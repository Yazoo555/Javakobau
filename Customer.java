//Question: 13 


public class Customer {
    private int customerId;
    private String name;
    private BankAccountNew bankAccount; // Using BankAccountNew instead of BankAccount

    // Parameterized constructor
    public Customer(int customerId, String name, BankAccountNew bankAccount) {
        this.customerId = customerId;
        this.name = name;
        this.bankAccount = bankAccount;
    }

    // Getter for customerId
    public int getCustomerId() {
        return customerId;
    }

    // Setter for customerId
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for bankAccount
    public BankAccountNew getBankAccount() {
        return bankAccount;
    }

    // Setter for bankAccount
    public void setBankAccount(BankAccountNew bankAccount) {
        this.bankAccount = bankAccount;
    }

    // Method to display customer details
    public void displayCustomerDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + name);
        bankAccount.displayAccountDetails(); // Display associated bank account details
    }

    // Main method to test the classes
    public static void main(String[] args) {
        // Create two BankAccountNew objects
        BankAccountNew account1 = new BankAccountNew("ACC12345", 1000.00);
        BankAccountNew account2 = new BankAccountNew("ACC67890", 2500.00);

        // Create two customers with their associated bank accounts
        Customer customer1 = new Customer(1, "Alice Johnson", account1);
        Customer customer2 = new Customer(2, "Bob Smith", account2);

        // Display customer details
        System.out.println("Customer 1 Details:");
        customer1.displayCustomerDetails();
        System.out.println();

        System.out.println("Customer 2 Details:");
        customer2.displayCustomerDetails();
    }
}
