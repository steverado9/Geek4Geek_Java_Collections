import java.util.HashSet;
import java.util.Set;

//This example demonstrates how HashSet stores
// unique element and does not maintain any insertion order.
public class SetInterfaceAddingElements {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        s.add("B");
        s.add("B");
        s.add("C");
        s.add("A");

        System.out.println(s);
    }
}
