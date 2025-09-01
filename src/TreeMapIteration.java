import java.util.Map;
import java.util.TreeMap;

public class TreeMapIteration {
    public static void main(String[] args) {
        // Initialization of TreeMap
        TreeMap<Integer, String> tm = new TreeMap<>();

        // Inserting elements
        tm.put(3, "Geeks");
        tm.put(2, "For");
        tm.put(1, "Geeks");

        // For-each loop for traversal over entrySet()
        for (Map.Entry<Integer, String> e : tm.entrySet()) {
            int k = e.getKey();
            String v = e.getValue();
            // Printing the key and value
            System.out.println(k + " : " + v);
        }
    }
}
