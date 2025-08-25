import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetAddingElement {
    public static void main(String[] args) {
        NavigableSet<String> ts = new TreeSet<String>();

        //Element are added using add() method
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("A");

        System.out.println("NavigableSet: " + ts);
    }
}
