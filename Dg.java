// Dog class (Subclass of Animal)
public class Dg extends Animal {
    // Additional property for Dog
    private String breed;

    // Constructor for Dog class, calling the constructor of Animal using super
    public Dg(String name, String breed) {
        // Using super to call the Animal constructor with name
        super(name);
        this.breed = breed;
    }

    // Constructor for Dog class with name, age, and breed
    public Dg(String name, int age, String breed) {
        // Using super to call the Animal constructor with name and age
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
