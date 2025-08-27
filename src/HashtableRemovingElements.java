import java.util.Hashtable;
import java.util.Map;

class HashtableRemovingElements {
    public static void main(String[] args) {
        //Intialization of a Hashtable
        Map<Integer, String> ht = new Hashtable<Integer, String>();

        //Inserting the elements
        //using put method
        ht.put(1, "Geeks");
        ht.put(2, "For");
        ht.put(3, "Geeks");
        ht.put(4, "For");

        //Initial Hashmap
        System.out.println("Initial map: " + ht);

        //Remove the map entry with key 4
        ht.remove(4);

        //Final Hashtable
        System.out.println("Updated map: " + ht);
    }
}
