import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        stack.pop();

        stack.push("D");
        stack.push("E");

        System.out.println(stack.peek());

        System.out.println(stack);
    }
}
