import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class TreeMapSortedMap {
    //Method To show TreeMap(SortedMap) Constructor
    static void Constructor() {
        //Creating a SortedMap
        SortedMap<Integer, String> sm = new ConcurrentSkipListMap<Integer, String>();

        //Mapping string values to int keys using put() method
        sm.put(10, "Geeks");
        sm.put(15, "4");
        sm.put(20, "Geeks");
        sm.put(25, "Welcomes");
        sm.put(30, "You");

        //Creating the TreeMap using SortedMap
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>(sm);

        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tm);
    }

    public static void main(String[] args) {
        System.out.println("TreeMap using TreeMap(SortedMap constructor");
        Constructor();
    }
}
