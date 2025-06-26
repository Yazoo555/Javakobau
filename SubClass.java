// Attempting to extend the FinalClass, which should cause a compile-time error
public class SubClass extends FinalClass {
    // This will cause a compile-time error since FinalClass is a final class and cannot be extended
    public void displayMessage() {
        System.out.println("Trying to override the final method!");
    }
}
