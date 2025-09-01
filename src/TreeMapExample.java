import java.util.TreeMap;

public class TreeMapExample {
    //To Show TreeMap constructor
    static void Constructor() {
        //creating an empty Treemap
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        //Mapping String values to int keys using put() method
        tm.put(10, "Geeks");
        tm.put(15, "For");
        tm.put(20, "Geeks");

        //Printing the elements of TreeMap
        System.out.println("TreeMap: " + tm);
    }

    public static void main(String[] args) {
        System.out.println("TreeMap using TreeMap() constructor");

        //calling constructor
        Constructor();
    }
}
