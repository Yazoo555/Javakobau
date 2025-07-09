import java.util.Collections;
import java.util.LinkedList;

public class ColorLinkedList {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Orange");

        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("Contains Red? " + colors.contains("Red"));

        Collections.shuffle(colors);
        System.out.println("Shuffled:");
        for (String color : colors) {
            System.out.println(color);
        }

        Collections.sort(colors);
        System.out.println("Sorted:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
