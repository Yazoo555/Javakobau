// Circle class (Subclass of Shape)
public class Circle extends Shape {
    // Property for radius
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override getPerimeter method for Circle
    @Override
    public double getPerimeter() {
        // Perimeter of a circle = 2 * pi * radius
        return 2 * Math.PI * radius;
    }

    // Override getArea method for Circle
    @Override
    public double getArea() {
        // Area of a circle = pi * radius^2
        return Math.PI * radius * radius;
    }

    // Method to display circle details
    public void displayCircleDetails() {
        System.out.println("Circle with radius: " + radius);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
    }
}
