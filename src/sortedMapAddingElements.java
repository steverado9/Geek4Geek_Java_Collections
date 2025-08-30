import java.util.SortedMap;
import java.util.TreeMap;

class sortedMapAddingElements {
    public static void main(String[] args) {
        //SortedMap with type parameters
        //for better type safety
        SortedMap<Integer, String> s1 = new TreeMap<>();
        SortedMap<Integer, String> s2 = new TreeMap<>();

        //Inserting the elements
        s1.put(3, "Geeks");
        s1.put(2, "For");
        s1.put(1, "Geeks");

        s2.put(3, "Geeks");
        s2.put(2, "For");
        s2.put(1, "Geeks");

        System.out.println(s1);
        System.out.println(s2);
    }
}
