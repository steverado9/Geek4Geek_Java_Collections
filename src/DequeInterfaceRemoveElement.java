import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterfaceRemoveElement {
    public static void main(String[] args) {
        //Initialization an deque
        Deque<String> dq = new ArrayDeque<String>();

        //add() method to insert
        dq.add("For");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");

        System.out.println(dq);
        System.out.println(dq.pop());
        System.out.println(dq.poll());
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());

    }
}
