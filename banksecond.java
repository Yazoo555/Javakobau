public class banksecond {
    // Account attributes
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Parameterized constructor to initialize the account attributes
    public banksecond(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // No-argument constructor that prints "User created!"
    public banksecond() {
        System.out.println("User created!");
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Main method to create objects using both constructors
    public static void main(String[] args) {
        // Creating an object using the no-argument constructor
        banksecond user1 = new banksecond(); // This will print "User created!"

        // Creating an object using the parameterized constructor
        banksecond user2 = new banksecond("John Doe", "123456789", 1500.75);
        user2.displayAccountDetails();
    }
}
