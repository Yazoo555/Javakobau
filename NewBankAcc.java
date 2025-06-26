public class NewBankAcc {
    // Private attributes for NewBankAcc
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor 1: No-argument constructor (sets default values)
    public NewBankAcc() {
        this.accountHolderName = "Unknown";
        this.accountNumber = "000000000";
        this.balance = 0.0;
    }

    // Constructor 2: Constructor with accountHolderName and accountNumber (balance set to 0)
    public NewBankAcc(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0.0; // Default balance if not provided
    }

    // Constructor 3: Constructor with accountHolderName, accountNumber, and balance
    public NewBankAcc(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Constructor 4: Constructor with only accountHolderName (random account number generated, balance set to 0)
    public NewBankAcc(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = generateRandomAccountNumber();
        this.balance = 0.0; // Default balance if not provided
    }

    // Method to generate a random account number (for demonstration)
    private String generateRandomAccountNumber() {
        return "ACC" + ((int)(Math.random() * 1000000));
    }

    // Getter and Setter methods for NewBankAcc attributes
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Main method to demonstrate constructor overloading
    public static void main(String[] args) {
        // Creating different NewBankAcc objects using different constructors

        // Using no-argument constructor
        NewBankAcc account1 = new NewBankAcc();
        System.out.println("Account 1 Details (No Arguments):");
        account1.displayAccountDetails();
        System.out.println();

        // Using constructor with accountHolderName and accountNumber (balance defaults to 0)
        NewBankAcc account2 = new NewBankAcc("John Doe", "123456789");
        System.out.println("Account 2 Details (Name and Account Number):");
        account2.displayAccountDetails();
        System.out.println();

        // Using constructor with accountHolderName, accountNumber, and balance
        NewBankAcc account3 = new NewBankAcc("Jane Smith", "987654321", 2500.75);
        System.out.println("Account 3 Details (Full Details):");
        account3.displayAccountDetails();
        System.out.println();

        // Using constructor with only accountHolderName (random account number generated)
        NewBankAcc account4 = new NewBankAcc("Alice Brown");
        System.out.println("Account 4 Details (Name Only, Random Account Number):");
        account4.displayAccountDetails();
    }
}
