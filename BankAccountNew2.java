//Question: 14

public class BankAccountNew2 {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    // Default constructor (no parameters)
    public BankAccountNew2() {
        this.accountNumber = "Unknown";
        this.balance = 0.0;
        this.accountHolderName = "Unnamed";
    }

    // Constructor with accountNumber and balance
    public BankAccountNew2(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = "Unnamed";  // Default name
    }

    // Constructor with accountNumber, balance, and accountHolderName
    public BankAccountNew2(String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter for accountHolderName
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Account Holder: " + accountHolderName);
    }

    // Main method to test the constructors
    public static void main(String[] args) {
        // Create BankAccountNew2 objects with different constructors

        // Using the default constructor
        BankAccountNew2 account1 = new BankAccountNew2();
        System.out.println("Account 1 Details (Default Constructor):");
        account1.displayAccountDetails();
        System.out.println();

        // Using the constructor with accountNumber and balance
        BankAccountNew2 account2 = new BankAccountNew2("ACC12345", 1000.00);
        System.out.println("Account 2 Details (Constructor with AccountNumber and Balance):");
        account2.displayAccountDetails();
        System.out.println();

        // Using the constructor with accountNumber, balance, and accountHolderName
        BankAccountNew2 account3 = new BankAccountNew2("ACC67890", 2500.00, "John Doe");
        System.out.println("Account 3 Details (Constructor with AccountNumber, Balance, and AccountHolderName):");
        account3.displayAccountDetails();
    }
}
