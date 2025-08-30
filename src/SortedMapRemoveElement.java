import java.util.SortedMap;
import java.util.TreeMap;

class SortedMapRemoveElement {
    public static void main(String[] args) {
        //Initialization of a SortedMap
        //using Generics
        SortedMap<Integer, String> tm = new TreeMap<Integer, String>();

        //Inserting the Elements
        tm.put(3, "Geeks");
        tm.put(2, "Geeks");
        tm.put(1, "Geeks");
        tm.put(4, "For");

        System.out.println(tm);

        tm.remove(4);

        System.out.println(tm);
    }
}
