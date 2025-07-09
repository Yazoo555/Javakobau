import java.util.LinkedList;
import java.util.Queue;

public class PrintQueueManager {
    public static void main(String[] args) {
        Queue<String> printQueue = new LinkedList<>();

        printQueue.add("Document1");
        printQueue.add("Document2");
        printQueue.add("Document3");

        printQueue.poll();

        printQueue.add("Document4");
        printQueue.add("Document5");

        System.out.println("Next print job: " + printQueue.peek());

        System.out.println("Print queue:");
        for (String job : printQueue) {
            System.out.println(job);
        }
    }
}
