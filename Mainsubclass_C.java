//Question number 9


public class Mainsubclass_C {
    // Base class A
    static class A {
        public void display() {
            System.out.println("Class A");
        }
    }

    // Subclass B inherits from A
    static class B extends A {
        @Override
        public void display() {
            System.out.println("Class B");
        }
    }

    // Subclass C inherits from B
    static class C extends B {
        @Override
        public void display() {
            System.out.println("Class C");
        }
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.display();  // Output: Class C
    }
}
