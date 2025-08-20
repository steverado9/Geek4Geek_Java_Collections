//concrete subclass of AbstarctSet

import java.util.AbstractSet;
import java.util.LinkedHashSet;

public class AbstractSetAddingElements {
    public static void main(String[] args) {
        //creating a LinkedHashSet to maintain insertion order
        AbstractSet<Integer> set = new LinkedHashSet<>();

        //Adding elements to the AbstractSet (through LinkedHashSet)
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("AbstractSet elements: " + set);
    }
}
