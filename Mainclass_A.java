//Question number 7

public class Mainclass_A {
    // Base class A
    static class A {
        public void display() {
            System.out.println("Class A");
        }
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.display();  // Output: Class A
    }
}
