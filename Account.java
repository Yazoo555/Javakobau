// Account.java
public class Account extends Customer {
    private String accountNumber;
    private double balance;

    public Account(String firstName, String lastName, String accountNumber, double balance) {
        super(firstName, lastName);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayAccountInfo() {
        displayCustomerInfo();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
