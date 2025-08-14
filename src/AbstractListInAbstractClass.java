import java.util.AbstractList;
import java.util.ArrayList;

public class AbstractListInAbstractClass {
    public static void main(String[] args) {
        //Creating an empty AbstractList
        AbstractList<String> list = new ArrayList<>();

        //use add() method to add elements in the list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("10");
        list.add("20");

        //Displaying the AbstractList
        System.out.println("AbstractList:" + list);
    }
}
