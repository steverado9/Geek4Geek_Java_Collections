import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        //Adding elements to the pQueue using add()
        pq.add(10);
        pq.add(20);
        pq.add(15);

        //Printing the top element of the priorityQueue
        System.out.println(pq.peek());

        //Printing the top element and removing it
        //in the PriorityQueue container
        System.out.println(pq.poll());

        //Printing the top element again
        System.out.println(pq.peek());

        System.out.println(pq);
    }
}
