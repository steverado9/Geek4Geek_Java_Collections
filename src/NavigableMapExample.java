import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {
        //Creating a NavigableMap using TreeMap
        NavigableMap<Integer, String> m = new TreeMap<>();

        //Adding elements to the map
        m.put(1, "One");
        m.put(3, "Three");
        m.put(2, "Two");

        System.out.println("NavigableMap: " + m);
    }
}
