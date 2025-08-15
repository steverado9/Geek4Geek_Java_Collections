import java.util.HashSet;
import java.util.Set;

public class SetInterfaceContainsMethod {
    public static void main(String[] args) {
        Set<String> h = new HashSet<String>();
        h.add("A");
        h.add("B");
        h.add("C");
        h.add("A");

        System.out.println("Set is " + h);

        String s = "D";

        System.out.println("Contains " + s + " " + h.contains(s));
    }
}
