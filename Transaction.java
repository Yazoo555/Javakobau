// Transaction.java
public class Transaction {
    public void transfer(Account fromAccount, Account toAccount, double amount) {
        if (fromAccount.getBalance() >= amount) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transferred " + amount + " from " +
                    fromAccount.getAccountNumber() + " to " + toAccount.getAccountNumber());
        } else {
            System.out.println("Transfer failed due to insufficient funds.");
        }
    }
}
