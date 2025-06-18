public class Main {
    public static void main(String[] args) {
        // Initialize the array with ages of 5 friends
        int[] ages = {25, 30, 22, 27, 29};  // Example ages
        
        // Display the elements of the array using a for loop
        System.out.println("Ages of my friends:");
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Friend " + (i + 1) + " age: " + ages[i]);
        }
    }
}
