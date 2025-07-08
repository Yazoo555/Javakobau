import java.util.HashSet;

public class SubsetChecker {
    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);
        setA.add(6);

        HashSet<Integer> setB = new HashSet<>();
        setB.add(1);
        setB.add(2);
        setB.add(3);

        System.out.println(setA.containsAll(setB));
    }
}
