import java.util.LinkedList;
import java.util.ListIterator;

public class LinklistListIterator {
    //Java Program to Demonstrate the
    //use of listIterator() in LinkedList
    public static void main(String[] args) {
        //Create an empty list
        LinkedList<String> l = new LinkedList<>();
        l.add("Geeks");
        l.add("For");
        l.add("Geeks");

        //Creating a ListIterator
        ListIterator<String> it = l.listIterator();

        //Using ListIterator to traverse the list

        //hasNext() is sued to check
        //If there are more elements in the list
        while (it.hasNext()) {
            //next() is used to retrieve elements in the list
            System.out.println(it.next());
        }
    }
}
