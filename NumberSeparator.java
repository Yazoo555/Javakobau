import java.io.*;
import java.util.*;

public class NumberSeparator {

    public List<Integer> read(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            if (line != null) {
                String[] parts = line.split("\\s+");
                for (String part : parts) {
                    numbers.add(Integer.parseInt(part));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return numbers;
    }

    public List<Integer> getEven(List<Integer> numbers) {
        List<Integer> evens = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }
        return evens;
    }

    public List<Integer> getOdd(List<Integer> numbers) {
        List<Integer> odds = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                odds.add(num);
            }
        }
        return odds;
    }

    public void write(List<Integer> numbers, String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (int num : numbers) {
                bw.write(num + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        NumberSeparator ns = new NumberSeparator();
        List<Integer> numbers = ns.read("numbers.txt");
        List<Integer> evens = ns.getEven(numbers);
        List<Integer> odds = ns.getOdd(numbers);
        ns.write(evens, "even.txt");
        ns.write(odds, "odd.txt");
    }
}
