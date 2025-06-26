// Main class to test Animal and Dog classes
public class main2 {
    public static void main(String[] args) {
        // Creating Dog objects using different constructors

        // Using constructor with name and breed
        Dog dog1 = new Dog("Buddy", 0, "Golden Retriever");
        System.out.println("Dog 1 Details (Name and Breed):");
        dog1.displayDetails();
        System.out.println();

        // Using constructor with name, age, and breed
        Dog dog2 = new Dog("Charlie", 3, "Beagle");
        System.out.println("Dog 2 Details (Name, Age, and Breed):");
        dog2.displayDetails();
    }
}
