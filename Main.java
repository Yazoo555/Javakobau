// Question Number 5 //

public class Main {
    public static void main(String[] args) {
        // Create and initialize a BankAccount object using the full-argument constructor
        BankAccount account = new BankAccount(
            "ACC123456789",            // accountNumber
            2500.50,                   // balance
            "Jane Doe",                // accountHolderName
            "742 Evergreen Terrace"    // accountHolderAddress
        );

        // Optionally, print out the account details
        System.out.println(account);

        // Or access individual fields via getters
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Holder Name: " + account.getAccountHolderName());
        System.out.println("Holder Address: " + account.getAccountHolderAddress());
    }
}
