public class BreakOnFiveWhileLoop {
    public static void main(String[] args) {
        System.out.println("Using while loop:");

        int i = 1;
        while (i <= 10) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println(i);
            i++;
        }
    }
}
