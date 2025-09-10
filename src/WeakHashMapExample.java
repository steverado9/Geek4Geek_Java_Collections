import java.util.Map;
import java.util.WeakHashMap;

// Java Program to Illustrate WeakHashMap class
// Via close(), containsValue(), containsKey()
// and isEmpty() method
public class WeakHashMapExample {
    public static void main(String[] args) {
        //Creating an empty WeakHashMap
        //of number and string type
        Map<Number, String> weak = new WeakHashMap<>();

        //Inserting custom elements
        //using put() method
        weak.put(1, "geeks");
        weak.put(2, "for");
        weak.put(3, "geeks");

        // Printing and alongside checking weak map
        System.out.println("our weak map: " + weak);

        // Checking if "for" exist
        if (weak.containsValue("for"))
            System.out.println("for exist");

        // Checking if 1 exist as a key in Map
        if (weak.containsKey(1))
            System.out.println("1 exist");

        // Removing all data
        // using clear() method
        weak.clear();

        // Checking whether the Map is empty or not
        // using isEmpty() method
        if (weak.isEmpty())
            // Display message for better readability
            System.out.println("empty map: " + weak);
    }
}
