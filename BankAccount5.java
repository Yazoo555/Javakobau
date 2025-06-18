// Question Number 9 //
public class BankAccount5 {
    // Attributes
    private String accountNumber;
    private double balance;
    private String accountHolderName;
    private String accountHolderAddress;

    // No-argument constructor
    public BankAccount5() {
        System.out.println("User created!");
    }

    // Parameterized constructor to initialize all attributes
    public BankAccount5(String accountNumber,
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
            "BankAccount5{accountNumber='%s', balance=%.2f, accountHolderName='%s', accountHolderAddress='%s'}",
            accountNumber, balance, accountHolderName, accountHolderAddress
        );
    }
}

// --- Main.java ---
class Main {
    public static void main(String[] args) {
        // Instantiate with no-argument constructor (prints "User created!")
        BankAccount5 defaultAccount = new BankAccount5();
        // Print default account details to use the variable
        System.out.println("Default account: " + defaultAccount);

        // Instantiate with parameterized constructor
        BankAccount5 myAccount = new BankAccount5(
            "ACC100200300",      // accountNumber
            1500.75,              // initial balance
            "John Smith",        // account holder name
            "221B Baker Street"  // account holder address
        );

        // Print account details
        System.out.println("New account created: " + myAccount);
    }
}
