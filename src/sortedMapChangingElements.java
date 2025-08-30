import java.util.SortedMap;
import java.util.TreeMap;

class sortedMapChangingElements {
    public static void main(String[] args) {
        //Intialization of a SortedMap
        //using Generics
        SortedMap<Integer, String> tm = new TreeMap<Integer, String>();

        //Inserting the Elements
        tm.put(3, "Geeks");
        tm.put(2, "Geeks");
        tm.put(1, "Geeks");

        System.out.println(tm);

        tm.put(2, "For");

        System.out.println(tm);
    }
}
