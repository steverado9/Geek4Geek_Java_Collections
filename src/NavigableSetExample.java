import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> ns = new TreeSet<>();

        //Add elements to the set
        ns.add(10);
        ns.add(20);
        ns.add(30);
        ns.add(40);
        ns.add(50);

        System.out.println("NavigableSet: " + ns);
    }
}
