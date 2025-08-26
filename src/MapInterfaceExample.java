import java.util.HashMap;
import java.util.Map;

//Java Program Implementing Map
//using its implemented class HashMap
public class MapInterfaceExample {
    public static void main(String[] args) {
        //Create a Map using HashMap
        Map<String, Integer> m = new HashMap<>();

        //Adding key-value pairs to the map
        m.put("Geek1", 1);
        m.put("Geek2", 2);
        m.put("Geek3", 3);

        System.out.println("Map elements: " + m);
    }
}
