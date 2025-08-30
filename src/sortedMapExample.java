import java.util.SortedMap;
import java.util.TreeMap;

// Java program to demonstartes
// basic operations on SortedMap
public class sortedMapExample {
    public static void main(String[] args) {
        SortedMap<String, Integer> s = new TreeMap<>();

        //Adding elements to the sorted map
        s.put("A", 1);
        s.put("C", 3);
        s.put("B", 2);

        System.out.println("SortedMap: " + s);

        //Getting values from the sorted map
        int ans = s.get("A");
        System.out.println("Value of A: " + ans);

        //Removing elements from the sorted map
        s.remove("B");

        System.out.println("Updated sortedMap After removal: " + s);
    }
}
