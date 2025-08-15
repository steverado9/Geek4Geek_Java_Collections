import java.util.AbstractSequentialList;
import java.util.LinkedList;

public class AbstractSequentialListExample {
    public static void main(String[] args) {
        //Creating an instance of AbstractSequentialList
        AbstractSequentialList<Integer> a = new LinkedList<>();

        //adding elements
        a.add(5);
        a.add(6);
        a.add(7);

        //Printing the list
        System.out.println(a);
    }
}
