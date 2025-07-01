// Question Number  2
abstract class Bank {
    // Abstract method
    abstract int getBalance();
}

// Subclass for Bank A
class BankA extends Bank {
    private final int balance = 100;

    @Override
    int getBalance() {
        return balance;
    }
}

// Subclass for Bank B
class BankB extends Bank {
    private final int balance = 150;

    @Override
    int getBalance() {
        return balance;
    }
}

// Subclass for Bank C
class BankC extends Bank {
    private final int balance = 200;

    @Override
    int getBalance() {
        return balance;
    }
}

// Main class to test the implementation
public class TaskTwo {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        System.out.println("Balance in Bank A: $" + bankA.getBalance());
        System.out.println("Balance in Bank B: $" + bankB.getBalance());
        System.out.println("Balance in Bank C: $" + bankC.getBalance());
    }
}
