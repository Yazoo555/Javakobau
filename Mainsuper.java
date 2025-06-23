//Question number 13

public class Mainsuper {
    // Superclass Shape
    static class Shape {
        String color;

        // Constructor
        public Shape(String color) {
            this.color = color;
        }

        public void area() {
            System.out.println("Area of shape is undefined.");
        }
    }

    // Subclass Rectangle inherits from Shape
    static class Rectangle extends Shape {
        double length;
        double width;

        // Constructor using super() to initialize color
        public Rectangle(String color, double length, double width) {
            super(color);  // Initializes 'color' from Shape
            this.length = length;
            this.width = width;
        }

        @Override
        public void area() {
            double result = length * width;
            System.out.println("Rectangle color: " + color);
            System.out.println("Area of rectangle: " + result);
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle("Green", 4.5, 2.0);
        r.area();
    }
}
