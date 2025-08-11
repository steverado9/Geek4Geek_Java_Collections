import java.util.LinkedList;
import java.util.ListIterator;

public class LinklistListIterator2 {
    //Iterate over elements of the list from a specified index
    public static void main(String[] args) {

        //Create an empty list
        LinkedList<Integer> l = new LinkedList<>();
        l.add(100);
        l.add(200);
        l.add(300);
        l.add(400);
        l.add(500);
        l.add(600);
        l.add(700);

        //Create a ListIterator
        ListIterator<Integer> it = l.listIterator(3);

        //Use the ListIterator to traverse the list
        System.out.println("Traversin the List from index 3: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
