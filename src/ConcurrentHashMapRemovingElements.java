import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Java program to demonstrate removing
// elements from ConcurrentHashMap
public class ConcurrentHashMapRemovingElements {
    public static void main(String[] args) {
        // Creating ConcurrentHashMap
        Map<String, String> m = new ConcurrentHashMap<>();

        //Adding the elements to the map
        //using put() method
        m.put("1", "One");
        m.put("2", "Two");
        m.put("3", "Three");
        m.put("4", "Four");
        m.put("5", "Five");
        m.put("6", "Six");
        System.out.println("Map: " + m);
        System.out.println();

        //Removing the mapping
        //with existing key 6
        //using remove() method
        String s = m.remove("6");

        //Printing the map after remove()
        System.out.println("After removing mapping with key 6:");
        System.out.println("Map: " + m);
        System.out.println("Value removed: "  + s);

        //Removing the mapping
        //with non-existing key 10
        //using remove() method
        s = m.remove("10");

        //Printing the map after remove()
        System.out.println("After removing mapping with key 10:");
        System.out.println("Map: " + m);
        System.out.println("Value removed: " + s);

        //Now clear the map using clear()
        m.clear();

        System.out.println("Map after use of clear()" + m);
    }
}
