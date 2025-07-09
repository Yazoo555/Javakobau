import java.util.ArrayList;
import java.util.Collections;

public class ArrayListRotator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);

        int rotateBy = 2;
        Collections.rotate(list, rotateBy);

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
