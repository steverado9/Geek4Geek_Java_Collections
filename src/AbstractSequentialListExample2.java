import java.util.AbstractSequentialList;
import java.util.LinkedList;

public class AbstractSequentialListExample2 {
    public static void main(String[] args) {
        //Creating an empty AbstractSequentialList
        AbstractSequentialList<String> a = new LinkedList<String>();

        //using add() method to add elements
        a.add("Geeks");
        a.add("for");
        a.add("Geeks");
        a.add("10");
        a.add("20");

        //Output the list
        System.out.println("AbstractSequentialList: " + a);

        //Remove the head using remove()
        a.remove(3);

        //Print the final list
        System.out.println("Final List: " + a);

        //Fetching the specific element from the list
        //using get() method
        System.out.println("The element is: " + a.get(2));
    }
}
