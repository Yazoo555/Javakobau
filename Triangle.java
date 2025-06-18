public class Triangle {

    // Instance variables for base and height
    private double base;
    private double height;

    // Parameterized constructor to initialize base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Method to calculate the area of the triangle
    public double calculateArea() {
        return 0.5 * base * height; // Formula: 1/2 * base * height
    }

    public static void main(String[] args) {
        // Create an instance of Triangle using the parameterized constructor
        Triangle triangle = new Triangle(10.0, 5.0);

        // Calculate and display the area of the triangle
        double area = triangle.calculateArea();
        System.out.println("The area of the triangle is: " + area);
    }
}
