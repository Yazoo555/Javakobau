import java.util.Arrays;
import java.util.Collections;

public class ArraySorter {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 8, 3, 1};

        Arrays.sort(numbers);
        System.out.println("Sorted ascending:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted descending:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
