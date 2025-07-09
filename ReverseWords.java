import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Hello World";
        String[] words = sentence.split(" ");

        Stack<String> stack = new Stack<>();
        for (String word : words) {
            stack.push(word);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
            if (!stack.isEmpty()) {
                reversed.append(" ");
            }
        }

        System.out.println(reversed.toString());
    }
}
