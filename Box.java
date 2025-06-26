public class Box {
    // Attributes for dimensions
    private double length;
    private double breadth;
    private double height;

    // Constructor for Cube (only length is provided)
    public Box(double length) {
        this.length = length;
        this.breadth = length;  // In a cube, length = breadth = height
        this.height = length;
    }

    // Constructor for Cuboid (length, breadth, and height are provided)
    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // No-argument constructor (sets default values)
    public Box() {
        this.length = 10;
        this.breadth = 8;
        this.height = 12;
    }

    // Method to calculate and print the volume of the box
    public void getVolume() {
        double volume = length * breadth * height;
        System.out.println("The volume of the box is: " + volume + " cubic units.");
    }

    // Main method to test the constructors
    public static void main(String[] args) {
        // Creating an object of Cube (only length is provided)
        Box cube = new Box(5); // This creates a cube with all sides 5 units
        cube.getVolume(); // Should print volume of cube

        // Creating an object of Cuboid (length, breadth, and height are provided)
        Box cuboid = new Box(5, 3, 4); // This creates a cuboid with given dimensions
        cuboid.getVolume(); // Should print volume of cuboid

        // Creating an object using the no-argument constructor (default values)
        Box defaultBox = new Box(); // Uses default values length=10, breadth=8, height=12
        defaultBox.getVolume(); // Should print volume of box with default dimensions
    }
}
