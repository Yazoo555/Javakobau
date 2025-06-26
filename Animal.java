// Animal class
public class Animal {
    // Properties for Animal
    private String name;
    protected int age;

    // Constructor for Animal class
    public Animal(String name) {
        this.name = name;
        this.age = age;
    }

    // Getter methods for Animal class
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display animal details
    public void displayDetails() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Age: " + age);
    }
}
