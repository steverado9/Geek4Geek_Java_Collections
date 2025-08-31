import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Java Program to demonstrates
// the working of ConcurrentMap
public class ConcurrentMapExample {
    public static void main(String[] args) {
        //Create a ConcurrentMap instance
        //using ConcurrentHashMap
        ConcurrentMap<Integer, String> map = new ConcurrentHashMap<>();

        //Adding key-value pairs using put()
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        System.out.println("ConcurrentMap: " + map);
    }
}
