import java.util.NavigableMap;
import java.util.TreeMap;

class NavigableMapAddElement {
    public static void main(String[] args) {
        // Instantiate an object
        // Since NavigableMap is an interface
        // We use TreeMap
        NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
        // Add elements using put()
        map.put(3, "Geeks");
        map.put(2, "For");
        map.put(1, "Geeks");
        System.out.println("NavigableMap " + map);
    }
}
