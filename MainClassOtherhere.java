interface Animal {
    // Abstract method to print the sound
    void makeSound();
}

class Dog implements Animal {
    public Dog() {
        System.out.println("Dog Created");
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat implements Animal {
    public Cat() {
        System.out.println("Cat Created");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class MainClassOtherhere {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
    }
}
