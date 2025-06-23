//Question number 5

public class MainAnimal {
    // Class Animal
    static class Animal {
        public void makeSound() {
            System.out.println("The animal makes a sound.");
        }
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();
    }
}
