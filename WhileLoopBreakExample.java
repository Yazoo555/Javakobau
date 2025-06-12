public class WhileLoopBreakExample {
    public static void main(String[] args) {
        int x = 10;

        while (x < 20) {
            if (x == 15) {
                break;  // Exit the loop when x reaches 15
            }
            System.out.println(x);
            x++;
        }
    }
}
