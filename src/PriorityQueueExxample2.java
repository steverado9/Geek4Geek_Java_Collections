import java.util.PriorityQueue;

public class PriorityQueueExxample2 {
    public static void main(String[] args) {
        //Priority Queue MinType
        PriorityQueue<Integer> p = new PriorityQueue<>();

        // Add elements to the queue
        p.add(3);
        p.add(10);
        p.add(7);
        p.add(2);

        //Print the head of the queue
        System.out.println("Head of Queue: " + p.peek());
    }
}
