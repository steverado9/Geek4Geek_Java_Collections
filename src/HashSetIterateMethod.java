import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterateMethod {
    public static void main(String[] args) {
        //Create a HashSet of Strings
        HashSet<String> hs = new HashSet<>();
        // Add elements to the HashSet
        hs.add("A");
        hs.add("B");
        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Z");

        //using the iterator() method to iterate over the HashSet
        System.out.println("Using iterator: ");
        Iterator<String> iterator = hs.iterator();

        //Travsersing Hashset
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //using enhanced for loop to iterate over the HashSet
        System.out.println("Using enhanced for loop: ");
        for (String element : hs) {
            System.out.println(element);
        }
    }
}
