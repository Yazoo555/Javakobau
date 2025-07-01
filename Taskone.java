// Question Number 1
abstract class Parent {
    // Abstract method
    abstract void message();
}

// First subclass
class ChildClass1 extends Parent {
    // Overriding the abstract method
    @Override
    void message() {
        System.out.println("This is first subclass");
    }
}

// Second subclass
class ChildClass2 extends Parent {
    // Overriding the abstract method
    @Override
    void message() {
        System.out.println("This is second subclass");
    }
}

// Main class to test the functionality
public class Taskone  {
    public static void main(String[] args) {
        // Creating object of ChildClass1
        Parent obj1 = new ChildClass1();
        obj1.message();

        // Creating object of ChildClass2
        Parent obj2 = new ChildClass2();
        obj2.message();
    }
}
