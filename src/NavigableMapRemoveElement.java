import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapRemoveElement {
    public static void main(String[] args) {
        // Instantiate an object
        // Since NavigableMap
        // is an interface
        // We use TreeMap
        NavigableMap<Integer, String> map = new TreeMap<Integer, String>();

        //Add elements using put();
        map.put(3, "Java");
        map.put(2, "C++");
        map.put(1, "Python");
        map.put(4, "Js");
        // Print the contents on the console
        System.out.println("NavigableMap: " + map);

        // Remove elements using remove()
        map.remove(4);

        // Print the contents on the console
        System.out.println("NavigableMap, after remove operation: " + map);

        // Clear the entire map using clear()
        map.clear();
        System.out.println("NavigableMap, after clear operation: " + map);

    }
}
