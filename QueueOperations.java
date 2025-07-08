import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.add("C");

        queue.remove();

        queue.add("D");
        queue.add("E");

        System.out.println(queue.peek());

        System.out.println(queue);
    }
}
