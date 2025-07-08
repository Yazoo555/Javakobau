import java.util.LinkedList;

public class LinkedListManipulator {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        System.out.println(names.isEmpty());

        names.addFirst("John");
        names.addLast("Alice");
        names.addLast("Bob");
        names.addLast("Alice");

        System.out.println(names.isEmpty());

        System.out.println(names.getFirst());
        System.out.println(names.getLast());

        System.out.println(names.indexOf("Alice"));
        System.out.println(names.lastIndexOf("Alice"));
    }
}
