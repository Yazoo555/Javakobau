//Question number 6


public class MainDogCat {
    // Superclass Animal
    static class Animal {
        public void makeSound() {
            System.out.println("The animal makes a sound.");
        }
    }

    // Subclass Dog
    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The dog barks.");
        }
    }

    // Subclass Cat
    static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The cat meows.");
        }
    }

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound(); // Output: The dog barks.
        a2.makeSound(); // Output: The cat meows.
    }
}
