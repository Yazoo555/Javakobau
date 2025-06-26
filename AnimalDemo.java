// Main class to test Animal and Dog classes
public class AnimalDemo {
    public static void main(String[] args) {
        // Creating an Animal object
        Animal animal1 = new Animal("Lion");
        System.out.println("Animal 1 Details:");
        animal1.displayDetails();
        System.out.println();

        // Creating a Dog object
        Dog dog1 = new Dog("Buddy", 3, "Golden Retriever");
        System.out.println("Dog 1 Details:");
        dog1.displayDetails();
    }
}
