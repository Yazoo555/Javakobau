import java.util.HashMap;
import java.util.Map;

public class CountryCapitalManager {
    private static HashMap<String, String> countryCapitals = new HashMap<>();

    public static void printMap(HashMap<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static String getCapital(String country) {
        return countryCapitals.get(country);
    }

    public static boolean containsCapital(String capital) {
        return countryCapitals.containsValue(capital);
    }

    public static void main(String[] args) {
        countryCapitals.put("Nepal", "Kathmandu");
        countryCapitals.put("USA", "Washington D.C.");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("India", "New Delhi");

        printMap(countryCapitals);

        System.out.println("Capital of Japan: " + getCapital("Japan"));
        System.out.println("Contains capital Paris? " + containsCapital("Paris"));

        for (Map.Entry<String, String> entry : countryCapitals.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }
}
