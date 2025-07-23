class Shape {
    // Method to get perimeter - generic shape returns 0 or can be abstract
    public double getPerimeter() {
        return 0;
    }

    // Method to get area - generic shape returns 0 or can be abstract
    public double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override getPerimeter for rectangle
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Override getArea for rectangle
    @Override
    public double getArea() {
        return length * width;
    }
}

public class MainClassOther {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);

        System.out.println("Rectangle perimeter: " + rect.getPerimeter());
        System.out.println("Rectangle area: " + rect.getArea());
    }
}
