public class BankAccount {
    // Account attributes
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Parameterized constructor to initialize the account attributes
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Main method to create an object using the parameterized constructor
    public static void main(String[] args) {
        // Creating an object of BankAccount using the parameterized constructor
        BankAccount myAccount = new BankAccount("John Doe", "123456789", 1500.75);
        
        // Displaying account details
        myAccount.displayAccountDetails();
    }
}
