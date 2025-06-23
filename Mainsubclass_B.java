//Question number 8


public class Mainsubclass_B {
    // Base class A
    static class A {
        public void display() {
            System.out.println("Class A");
        }
    }

    // Subclass B inheriting from A
    static class B extends A {
        @Override
        public void display() {
            System.out.println("Class B");
        }
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.display();  // Output: Class B
    }
}
