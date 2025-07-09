import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        System.out.println("Is list empty? " + list.isEmpty());

        list.addFirst("FirstElement");
        list.addLast("LastElement");

        System.out.println("Is list empty? " + list.isEmpty());

        for(String item : list) {
            System.out.println(item);
        }
    }
}
