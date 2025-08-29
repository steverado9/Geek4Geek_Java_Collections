import java.util.LinkedHashMap;

public class LinkedHashMapAddingElemet {
    public static void main(String[] args) {
        //Initialization of a LinkedHashMap
        //using Generics
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
        //Add mappings to Map
        //using put() method
        lhm.put(3, "Geeks");
        lhm.put(2, "For");
        lhm.put(1, "Geeks");

        //Printing mappings to the console
        System.out.println(lhm);

        // Updating the value with key 2
        lhm.put(2, "For");

        // Printing the updated Map
        System.out.println("Updated Map: " + lhm);
    }
}
