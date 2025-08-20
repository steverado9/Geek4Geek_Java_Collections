import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AbstractSetIterator {
    public static void main(String[] args) {
        //Creating a HashSet, which is a concrete subclass of AbstarctSet
        Set<Integer> set = new HashSet<>();

        // Adding elements to the set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        // Creating an iterator to iterate over the set
        Iterator<Integer> i = set.iterator();

        //iterating over the elements using the iterator
        System.out.println("Iterating over the elements");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
