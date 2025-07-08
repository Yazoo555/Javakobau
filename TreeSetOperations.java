import java.util.TreeSet;

public class TreeSetOperations {
    public static void main(String[] args) {
        TreeSet<String> setA = new TreeSet<>();
        setA.add("Red");
        setA.add("Green");
        setA.add("Blue");

        TreeSet<String> setB = new TreeSet<>();
        setB.add("Green");
        setB.add("Yellow");
        setB.add("Blue");

        TreeSet<String> intersection = new TreeSet<>(setA);
        intersection.retainAll(setB);

        TreeSet<String> union = new TreeSet<>(setA);
        union.addAll(setB);

        TreeSet<String> difference = new TreeSet<>(setA);
        difference.removeAll(setB);

        System.out.println("Intersection: " + intersection);
        System.out.println("Union: " + union);
        System.out.println("Difference: " + difference);
    }
}
