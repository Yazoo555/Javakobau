public class TenDigitNumberValidator {
    public static void main(String[] args) {
        String input = "9876543210";
        boolean matches = input.matches("^[789][0-9]{9}$");
        System.out.println(matches);
    }
}
