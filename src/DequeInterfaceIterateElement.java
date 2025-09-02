import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeInterfaceIterateElement {
    public static void main(String[] args) {
        //Initializating a deque
        Deque<String> dq = new ArrayDeque<String>();

        //add() method to insert
        dq.add("For");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");
        dq.add("is so good");

        for (Iterator itr = dq.iterator(); itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }

        for (Iterator itr = dq.descendingIterator(); itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
    }
}
