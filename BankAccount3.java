// Question Number 7 //

public class BankAccount3 {
    // Attributes
    private String accountNumber;
    private double balance;
    private String accountHolderName;
    private String accountHolderAddress;

    // Parameterized constructor to initialize all attributes
    public BankAccount3(String accountNumber,
                       double balance,
                       String accountHolderName,
                       String accountHolderAddress) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountHolderAddress = accountHolderAddress;
    }

    // Getter methods
    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public String getAccountHolderName() { return accountHolderName; }
    public String getAccountHolderAddress() { return accountHolderAddress; }

    // Method to deposit money into the account
    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited %.2f. Current balance: %.2f%n", amount, balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdrawMoney(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.printf("Withdrew %.2f. Current balance: %.2f%n", amount, balance);
            } else {
                System.out.println("Insufficient balance to withdraw " + amount);
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    @Override
    public String toString() {
        return String.format(
            "BankAccount{accountNumber='%s', balance=%.2f, accountHolderName='%s', accountHolderAddress='%s'}",
            accountNumber, balance, accountHolderName, accountHolderAddress
        );
    }
}

// Main.java (placed in the same file as package-private class to avoid public conflict)
class Main {
    public static void main(String[] args) {
        // Create a BankAccount object using the parameterized constructor
        BankAccount myAccount = new BankAccount(
            "ACC100200300",     // accountNumber
            1500.75,             // initial balance
            "John Smith",       // account holder name
            "221B Baker Street" // account holder address
        );

        // Print initial account details
        System.out.println("New account created: " + myAccount);
    }
}
