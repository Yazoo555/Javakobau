// Main class to test FinalClass and SubClass
public class mainnew11 {
    public static void main(String[] args) {
        // Creating an instance of FinalClass
        FinalClass finalClass = new FinalClass();
        finalClass.displayMessage();

        // Creating an instance of SubClass (this will cause a compile-time error)
        // SubClass subClass = new SubClass(); // Uncommenting this line will cause an error
    }
}
