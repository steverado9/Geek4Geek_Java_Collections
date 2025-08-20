// Java Program to demostrates
// the working of remove() and
// removeAll() method

import java.util.*;

public class AbstractSetRemoveElements {
    public static void main(String[] args) {
        //Creating a HashSet, which is a concrete subclass of AbstractSet
        Set<Integer> set = new HashSet<>();

        //Adding elements to the set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        //print the set before removal
        System.out.println("Set before removal(): " + set);

        //Removing a single element using remove()

        //Removes the element 3 from the set
        set.remove(3);
        System.out.println("set after removal of element 3: " + set);

        //Creating a collection to remove multiple elements
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(5);

        //Remove all elemnts in the collection using
        //removeAll() Removes all elements that are in l

        set.removeAll(l);
        System.out.println("set after removeAll(): " + set);
    }
}
