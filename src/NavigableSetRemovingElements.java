import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetRemovingElements {
    public static void main(String[] args) {
        NavigableSet<String> ts = new TreeSet<String>();

        //Elements are added using add() method
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("B");
        ts.add("D");
        ts.add("E");
        System.out.println("NavigableSet: " + ts);

        //Removing the element b
        ts.remove("B");

        System.out.println("After removing element " + ts);

        //Remove the First element of TreeSet
        ts.pollLast();

        System.out.println("After the removal of First Element " + ts);

        //Remove the Last element of TreeSet
        ts.pollLast();

        System.out.println("After the removal of Last Element " + ts);
    }
}
