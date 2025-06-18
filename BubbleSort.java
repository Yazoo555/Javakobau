public class BubbleSort {
    public static void main(String[] args) {
        // 1. Declare and initialize the array of integers
        int[] numbers = { 64, 34, 25, 12, 22, 11, 90 };

        System.out.print("Original array: ");
        printArray(numbers);

        // 2. Sort the array using bubble sort
        bubbleSort(numbers);

        System.out.print("Sorted array:   ");
        printArray(numbers);
    }

    // Method to perform bubble sort on an integer array
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Helper method to print the contents of the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
