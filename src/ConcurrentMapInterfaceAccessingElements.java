import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;

class ConcurrentMapInterfaceAccessingElements {
    public static void main(String[] args) {
        //Instantiate an object
        //Since ConcurrentMap
        //is an interface so we use
        //ConcurrentSkipListMap
        ConcurrentMap<Integer, String> map = new ConcurrentSkipListMap<Integer, String>();

        //insert mapping using put method
        map.put(100, "Geeks");
        map.put(101, "for");
        map.put(102, "Geeks");

        //Displaying the HashMap
        System.out.println("The Mappings are: ");
        System.out.println(map);

        //Display the value of 100
        System.out.println("The value associated to " + "100 is: " + map.get(100));

        //Getting the value of 101
        System.out.println("The value associated to " + "101 is : " + map.get(101));
    }
}
