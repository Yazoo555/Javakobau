public class AlphanumericValidator {
    public static void main(String[] args) {
        String input = "a1B2c3";
        boolean matches = input.matches("^[a-zA-Z0-9]{6}$");
        System.out.println(matches);
    }
}
