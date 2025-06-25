//Question number 14


public class MainAnimalDog {
    // Final class - cannot be extended
    public final static class Animal {
        public void sound() {
            System.out.println("Animal makes a sound.");
        }
    }

    // Attempt to inherit from final class (this will cause a compile-time error)
    /*
    static class Dog extends Animal {
        public void sound() {
            System.out.println("Dog barks.");
        }
    }
    */

    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
    }
}
