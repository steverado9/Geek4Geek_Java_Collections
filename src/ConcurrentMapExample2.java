import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Java Program to illustrate methods
// of ConcurrentMap interface
class ConcurrentMapExample2 {
    public static void main(String[] args) {
        //Since ConcurrentMap is an interface,
        //We create instance using ConcurrentHashMap
        ConcurrentMap<Integer, String> m = new ConcurrentHashMap<Integer, String>();
        m.put(100, "Geeks");
        m.put(101, "For");
        m.put(102, "Geeks");

        //Here we cant add Hello because 101 key is already present
        m.putIfAbsent(101, "Hello");

        //We can remove entry because 101 key is associated
        //with for value
        m.remove(101, "For");

        //Now we can add Hello
        m.putIfAbsent(101, "Hello");

        //we can replace Hello with for
        m.replace(101, "Hello", "For");
        System.out.println("Map contents: " + m);
    }
}
