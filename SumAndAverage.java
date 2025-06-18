public class SumAndAverage {
    public static void main(String[] args) {
        // 1. Declare and initialize the array of floating-point numbers
        double[] values = { 3.5, 7.2, 1.8, 9.0, 4.6 };

        // 2. Compute the sum
        double sum = 0.0;
        for (double v : values) {
            sum += v;
        }

        // 3. Compute the average
        double average = sum / values.length;

        // 4. Print results
        System.out.printf("Sum of array elements: %.2f%n", sum);
        System.out.printf("Average of array elements: %.2f%n", average);
    }
}
