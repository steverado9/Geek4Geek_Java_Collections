import java.util.HashSet;
import java.util.Set;

public class SetInterfaceRemovingElement {
    public static void main(String[] args) {
        //Declaring object of set of type String
        Set<String> h = new HashSet<String>();

        //Elements are added using add() method, custom input elements
        h.add("A");
        h.add("B");
        h.add("C");
        h.add("B");
        h.add("D");
        h.add("E");

        System.out.println("Intial HashSet " + h);

        //Removing custom element using remove() method
        h.remove("B");
        System.out.println("After removing element " + h);
    }
}
