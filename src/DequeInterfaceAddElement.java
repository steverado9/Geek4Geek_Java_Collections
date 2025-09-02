import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterfaceAddElement {
    public static void main(String[] args) {
        //Initialization an deque
        Deque<String> dq = new ArrayDeque<String>();

        //add() method to insert
        dq.add("for");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");

        System.out.println(dq);
    }
}
