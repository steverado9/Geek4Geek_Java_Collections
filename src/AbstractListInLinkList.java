import java.util.AbstractList;
import java.util.LinkedList;

public class AbstractListInLinkList {
    public static void main(String[] args) {
        //Creating an empty Abstarctlist
        AbstractList<String> list = new LinkedList<String>();

        //using add() method to add elements in the list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("10");
        list.add("20");

        //Output the list
        System.out.println("AbstractList: " + list);

        //Remove the head using remove()
        list.remove(3);

        //Print the final list
        System.out.println("Final Abstract: " + list);

        //getting the index of last occurence
        //using lastIndexOf() method
        int lastindex = list.lastIndexOf("20");

        //printing the Index
        System.out.println("Last indexof A: " + lastindex);
    }
}
