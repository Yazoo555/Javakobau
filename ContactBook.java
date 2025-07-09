import java.util.HashMap;
import java.util.Map;

public class ContactBook {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();

        contacts.put("Ram Babu", "123-456-7890");
        contacts.put("Yajju", "234-567-8901");
        contacts.put("Looza", "345-678-9012");

        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
