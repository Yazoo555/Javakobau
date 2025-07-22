import java.io.BufferedReader;
import java.io.FileReader;

public class WordCount {
    public static void main(String[] args) {
        int wordCount = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("task3.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                if (words.length == 1 && words[0].isEmpty()) {
                    continue;
                }
                wordCount += words.length;
            }
            reader.close();
            System.out.println("Total words: " + wordCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
