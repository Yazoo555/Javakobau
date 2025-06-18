public class ReverseArray {
    public static void main(String[] args) {
        // 1. Declare and initialize the array
        int[] numbers = { 10, 20, 30, 40, 50 };

        // 2. Print the elements in reverse order
        System.out.print("Array in reverse order: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
