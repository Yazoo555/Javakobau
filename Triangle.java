public class Triangle {

    // Attributes to store the base and height of the triangle
    private double base;
    private double height;

    // Parameterized constructor to initialize base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Method to calculate the area of the triangle
    public double calculateArea() {
        return 0.5 * base * height;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a Triangle object using the parameterized constructor
        Triangle triangle = new Triangle(10.0, 5.0);

        // Calculate and print the area of the triangle
        double area = triangle.calculateArea();
        System.out.println("Area of the triangle: " + area);
    }
}
