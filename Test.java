// Test.java
public class Test {
    public static void main(String[] args) {
        Account acc1 = new Account("Yajju", "Chansi", "A001", 100000000.0);
        Account acc2 = new Account("Meri pyari Looza", "Yestaii ho hai", "A002", 500.0);

        acc1.displayAccountInfo();
        acc2.displayAccountInfo();

        Transaction transaction = new Transaction();

        transaction.transfer(acc1, acc2, 300.0);

        System.out.println("\nAfter Transfer:");
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
    }
}



 