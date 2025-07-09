import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpperLowerSequenceFinder {
    public static void main(String[] args) {
        String input = "Abc Def GHI Jklm Nop QrS";
        Pattern pattern = Pattern.compile("[A-Z][a-z]+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
