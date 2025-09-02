import java.util.PriorityQueue;
import java.util.Queue;

//  we can use the remove() method
//to remove an element from a queue,
public class QueueRemovingElements {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();

        //Add elements to the pq
        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println("Initial Queue: " + pq);

        pq.remove("Geeks");

        System.out.println("After Remove: " + pq);

        System.out.println("Poll Method: " + pq.poll());

        System.out.println("Final Queue: " + pq);
    }
}
