import java.io.*;
import java.util.*;

public class NumberSeparator {

    public static void main(String[] args) {
        NumberSeparator ns = new NumberSeparator();
        ns.read("filename.txt");  
    }

    public void read(String filePath) {
        List<Long> numbers = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            if (line != null) {
                String[] parts = line.trim().split("\\s+");
                for (String part : parts) {
                    try {
                        numbers.add(Long.parseLong(part));
                    } catch (NumberFormatException e) {
                        System.out.println("Skipping invalid number: " + part);
                    }
                }
            }

            List<Long> evenNumbers = getEven(numbers);
            List<Long> oddNumbers = getOdd(numbers);

            write(evenNumbers, "even.txt");
            write(oddNumbers, "odd.txt");

            System.out.println("Odd and even numbers written successfully.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public List<Long> getEven(List<Long> numbers) {
        List<Long> even = new ArrayList<>();
        for (long num : numbers) {
            if (num % 2 == 0) {
                even.add(num);
            }
        }
        return even;
    }

    public List<Long> getOdd(List<Long> numbers) {
        List<Long> odd = new ArrayList<>();
        for (long num : numbers) {
            if (num % 2 != 0) {
                odd.add(num);
            }
        }
        return odd;
    }

    public void write(List<Long> numbers, String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (long num : numbers) {
                bw.write(num + " ");
            }
        } catch (IOException e) {
            System.out.println("Error writing to file " + filePath + ": " + e.getMessage());
        }
    }
}
