public class QuitOnMultipleOfThree {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.println("Multiple of 3 encountered: " + i + ". Exiting loop.");
                break;  // Quit the loop when multiple of 3 is found
            }
            System.out.println(i);
        }
    }
}
