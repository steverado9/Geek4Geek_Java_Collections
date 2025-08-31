import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

class ConcurrentMapInterfaceRemoveElement {
    public static void main(String[] args) {
        //Create a ConcurrentMap instance using
        //ConcurrentHashMap
        ConcurrentMap<Integer, String> map = new ConcurrentHashMap<>();

        //Adding key-value pairs using put()
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        System.out.println("ConcurrentMap: " + map);

        //Remove element with key 2
        map.remove(2);

        //Print the map contents after removal
        System.out.println("ConcurretMap contents after removal: " + map);
    }
}
