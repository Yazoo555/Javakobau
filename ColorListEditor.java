import java.util.LinkedList;

public class ColorListEditor {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        int index = colors.indexOf("green");
        if (index != -1) {
            colors.set(index, "purple");
        }

        colors.remove("blue");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
