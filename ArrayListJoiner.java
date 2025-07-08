import java.util.ArrayList;

public class ArrayListJoiner {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Apple");
        arrayList1.add("Banana");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Cherry");
        arrayList2.add("Date");

        arrayList1.addAll(arrayList2);

        for (String item : arrayList1) {
            System.out.println(item);
        }
    }
}
