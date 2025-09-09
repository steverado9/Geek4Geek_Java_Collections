import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {
    public static void main(String[] args) {
        //Create a concurrentLinkedQueue
        ConcurrentLinkedQueue<Integer> q = new ConcurrentLinkedQueue<>();

        //Adding elements to the queue
        q.offer(1);
        q.offer(2);
        q.offer(3);

        System.out.println("Queue after adding elements: " + q);
    }
}
