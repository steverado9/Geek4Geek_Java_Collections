import java.sql.SQLOutput;
import java.util.LinkedHashSet;

public class LinkedHashSetExample2 {
    public static void main(String[] args) {
        //Creating an empty LinkedHashSet of string type
        LinkedHashSet<String> lh = new LinkedHashSet<>();

        //Adding elements to above Set using add() method
        lh.add("Geek");
        lh.add("For");
        lh.add("Geeks");
        lh.add("A");
        lh.add("B");
        lh.add("Z");

        System.out.println(lh);

        //Removing the element from above Set
        lh.remove("B");

        //Again removing the element
        System.out.println("After removing element " + lh);

        //Returning false if the element is not present
        System.out.println("AC");
    }
}
