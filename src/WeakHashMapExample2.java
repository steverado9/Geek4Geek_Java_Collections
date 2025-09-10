import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

// Java Program to Illustrate WeakHashMap class
// Via entrySet(), keySet() and Values() Method
public class WeakHashMapExample2 {
    public static void main(String[] args) {
        // Creating an empty WeakHashMap
        // of number and string type
        Map<Number, String> weak = new WeakHashMap<Number, String>();
        // Inserting elements
        // using put() method
        weak.put(1, "geeks");
        weak.put(2, "for");
        weak.put(3, "geeks");

        // Creating object of Set interface
        Set set1 = weak.entrySet();

        // Checking above Set
        System.out.println(set1);

        // Creating set for key
        Set keySet = weak.keySet();

        // Checking keySet
        System.out.println("key set: " + keySet);

        Collection value = weak.values();

        // Checking values of map and printing them
        System.out.println("values: " + value);
    }
}
