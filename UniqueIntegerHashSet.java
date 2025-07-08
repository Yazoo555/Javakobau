import java.util.HashSet;

public class UniqueIntegerHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(10);
        numbers.add(20);

        System.out.println(numbers);
    }
}
