public class CharacterCheck {
    public static boolean isValidString(String str) {
        return str.matches("[a-zA-Z0-9]+");
    }

    public static void main(String[] args) {
        String test1 = "Hello123";
        String test2 = "Hello_123";

        System.out.println(isValidString(test1));  // true
        System.out.println(isValidString(test2));  // false
    }
}
