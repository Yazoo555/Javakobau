public class Triangle {
    double base;
    double height;
    double area;

    // Parameterized constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.area = 0.5 * base * height;
    }

    // Method to display the area
    public void displayArea() {
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area of Triangle: " + area);
    }

    public static void main(String[] args) {
        // Create object using parameterized constructor
        Triangle triangle1 = new Triangle(10, 5);

        // Display the area
        triangle1.displayArea();
    }
}
