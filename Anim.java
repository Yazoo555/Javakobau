// Animal class (Base class)
public class Anim {
    // Properties for Animal
    private String name;
    private int age;

    // Constructor that accepts name as a parameter
    public Anim(String name) {
        this.name = name;
    }

    // Constructor to initialize both name and age
    public Anim(String name, int age) {
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
