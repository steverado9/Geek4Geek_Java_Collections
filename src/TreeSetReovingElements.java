import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetReovingElements {
    public static void main(String[] args) {
        //Creating an object of NavigableSet with reference to TreeSet class
        NavigableSet<String> ts = new TreeSet<>();

        //Element are added using add() method
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");
        ts.add("A");
        ts.add("B");
        ts.add("Z");

        //Print and display initial element of TreeSet
        System.out.println("Initial TreeSet " + ts);

        //Removing a specific existing element inserted above
        ts.remove("B");

        //Printing the updated TreeSet
        System.out.println("After removing element " + ts);

        //Now removing the first element using pollFirst() method
        ts.pollFirst();

        //Again Printing the updated TreeSet
        System.out.println("After removing first " + ts);

        //Removing the last element using pollLast() method
        ts.pollLast();

        //Lastly pritning the elements of TreeSet remaining to
        // first out pollLast() method
        System.out.println("After removing last " + ts);
    }
}
