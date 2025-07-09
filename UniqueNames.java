import java.util.TreeSet;

public class UniqueNames {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Ram");
        names.add("Bala");
        names.add("Yajju");
        names.add("Looza");
        names.add("Apple");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
