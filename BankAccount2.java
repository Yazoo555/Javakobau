// Question Number 6 //


public class BankAccount2 {
    // Attributes
    private String accountNumber;
    private double balance;
    private String accountHolderName;
    private String accountHolderAddress;

    // No-argument constructor
    public BankAccount2() {
        // Default constructor
    }

    // Full-argument constructor
    public BankAccount2(String accountNumber,
                       double balance,
                       String accountHolderName,
                       String accountHolderAddress) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountHolderAddress = accountHolderAddress;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountHolderAddress() {
        return accountHolderAddress;
    }

    // Setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountHolderAddress(String accountHolderAddress) {
        this.accountHolderAddress = accountHolderAddress;
    }

    // toString override for easy printing
    @Override
    public String toString() {
        return "BankAccount{" +
               "accountNumber='" + accountNumber + '\'' +
               ", balance=" + balance +
               ", accountHolderName='" + accountHolderName + '\'' +
               ", accountHolderAddress='" + accountHolderAddress + '\'' +
               '}';
    }

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
}
