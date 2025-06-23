//Question number 11


public class MainShape {
    // Superclass Shape
    static class Shape {
        String color;

        // Constructor
        public Shape(String color) {
            this.color = color;
        }

        // Method to return area (default implementation)
        public void area() {
            System.out.println("Area of shape is undefined.");
        }
    }

    public static void main(String[] args) {
        Shape s = new Shape("Red");
        s.area();  // Output: Area of shape is undefined.
    }
}
