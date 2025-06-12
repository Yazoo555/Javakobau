public class WhileLoopContinueExample {
    public static void main(String[] args) {
        int x = 10;

        while (x < 20) {
            if (x == 15) {
                x++;       // increment before continue to avoid infinite loop
                continue;  // skip printing 15 and jump to next iteration
            }
            System.out.println(x);
            x++;
        }
    }
}
