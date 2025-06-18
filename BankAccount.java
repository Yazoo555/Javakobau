// Question Number 5 //

public class BankAccount {
    // Attributes
    private String accountNumber;
    private double balance;
    private String accountHolderName;
    private String accountHolderAddress;

    // No-argument constructor
    public BankAccount() {
        // You could set default values here if you like
    }

    // Full-argument constructor
    public BankAccount(String accountNumber,
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
}
