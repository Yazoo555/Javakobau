// Dog class inherits from Animal
public class Dog extends Animal {
    // Additional property for Dog
    private String breed;

    // Constructor for Dog class
    public Dog(String name, int age, String breed) {
        // Calling the constructor of the parent class (Animal)
        super(name);
        this.breed = breed;
    }

    // Getter method for breed
    public String getBreed() {
        return breed;
    }

    // Overriding the displayDetails method to include breed
    @Override
    public void displayDetails() {
        // Calling the parent class method to display name and age
        super.displayDetails();
        System.out.println("Dog Breed: " + breed);
    }
}
