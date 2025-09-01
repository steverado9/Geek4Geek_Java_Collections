import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample2 {
    // Method To illustrate constructor<Map>
    static void Constructor() {
        //Creating an empty HashMap
        Map<Integer, String> m = new HashMap<>();

        // Mapping string values to int keys using put() method
        m.put(10, "Geeks");
        m.put(20, "For");
        m.put(30, "Geeks");
        // Creating the TreeMap using the Map
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>(m);

        //Printing the elements of TreeMap
        System.out.println("TreeMap: " + tm);
    }

    public static void main(String[] args) {
        System.out.println("TreeMap using TreeMap(Map) Constructor");
        Constructor();
    }
}
