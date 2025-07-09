import java.util.ArrayList;
import java.util.Collections;

public class ColorSorter {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(colors, "Blue", "Red", "Green", "Yellow", "Orange");

        Collections.sort(colors);
        System.out.println("Sorted ascending:");
        for (String color : colors) {
            System.out.print(color + " ");
        }
        System.out.println();

        Collections.sort(colors, Collections.reverseOrder());
        System.out.println("Sorted descending:");
        for (String color : colors) {
            System.out.print(color + " ");
        }
    }
}
