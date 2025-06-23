//Question number 12

public class MainRectangle {
    // Superclass Shape
    static class Shape {
        String color;

        // Constructor
        public Shape(String color) {
            this.color = color;
        }

        // Method to print area info (general placeholder)
        public void area() {
            System.out.println("Area of shape is undefined.");
        }
    }

    // Subclass Rectangle inherits from Shape
    static class Rectangle extends Shape {
        double length;
        double width;

        // Constructor
        public Rectangle(String color, double length, double width) {
            super(color); // Call Shape's constructor
            this.length = length;
            this.width = width;
        }

        // Override area method
        @Override
        public void area() {
            double result = length * width;
            System.out.println("Rectangle color: " + color);
            System.out.println("Area of rectangle: " + result);
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle("Blue", 5.0, 3.0);
        r.area();  // Output: Rectangle color: Blue, Area: 15.0
    }
}
