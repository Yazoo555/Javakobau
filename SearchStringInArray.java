import java.util.Scanner;

public class SearchStringInArray {
    public static void main(String[] args) {
        // 1. Declare and initialize the array of strings
        String[] items = { "apple", "banana", "cherry", "date", "elderberry" };

        // 2. Read the target string from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to search for: ");
        String target = scanner.nextLine();
        scanner.close();

        // 3. Search the array
        int foundIndex = -1;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(target)) {
                foundIndex = i;
                break;
            }
        }

        // 4. Print the result
        if (foundIndex != -1) {
            System.out.println("\"" + target + "\" found at index " + foundIndex + ".");
        } else {
            System.out.println("\"" + target + "\" is not present in the array.");
        }
    }
}
