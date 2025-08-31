import java.util.concurrent.*;
class ConcurrentMapAddingElement {
    public static void main(String[] args) {
        //Create a ConcurrentMap instance
        //Using ConcurrentHashMap
        ConcurrentMap<Integer, String> map = new ConcurrentHashMap<>();

        //Adding key-value pairs using put()
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        System.out.println("ConcurrentMap contents: " + map);
    }
}
