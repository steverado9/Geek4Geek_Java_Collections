import java.util.HashSet;
import java.util.Set;

public class SetInterfaceIterating {
    public static void main(String[] args) {
        //Creating object of Set and declearing String type
        Set<String> h = new HashSet<String>();

        //Adding elements to Set using add() method, Custom input elements
        h.add("A");
        h.add("B");
        h.add("C");
        h.add("B");
        h.add("D");
        h.add("E");

        //Iterating through the Set via for-each loop
        for (String value : h) {
            //Printing all the values inside the object
            System.out.println(value + ", ");
        }
    }
}
