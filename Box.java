// Question Number 11

public class Box {

    // Attributes for Box dimensions
    private double length;
    private double breadth;
    private double height;

    // No-argument constructor setting default values
    public Box() {
        this.length = 10;
        this.breadth = 8;
        this.height = 12;
    }

    // Constructor for Cube (same length, breadth, height)
    public Box(double length) {
        this.length = length;
        this.breadth = length;  // For a cube, all sides are the same
        this.height = length;
    }

    // Constructor for Cuboid (length, breadth, height)
    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Method to calculate and print the volume
    public void getVolume() {
        double volume = length * breadth * height;
        System.out.println("The volume of the box is: " + volume);
    }

    // Main method to test the constructors
    public static void main(String[] args) {
        // Create a cube with length 5
        Box cube = new Box(5);
        cube.getVolume();  // Should print the volume of the cube

        // Create a cuboid with different dimensions
        Box cuboid = new Box(4, 6, 10);
        cuboid.getVolume();  // Should print the volume of the cuboid

        // Create a box with default dimensions
        Box defaultBox = new Box();
        defaultBox.getVolume();  // Should print the volume of the default box
    }
}
