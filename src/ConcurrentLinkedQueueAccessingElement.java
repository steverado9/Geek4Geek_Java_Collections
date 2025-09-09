import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueAccessingElement {
    public static void main(String[] args) throws IllegalStateException {
        //Create an instance of ConcurrentLinkedQueue
        ConcurrentLinkedQueue<Integer> q = new ConcurrentLinkedQueue<>();

        //Add numbers to end of queue
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println("Queue: " + q);

        //print head using element()
        System.out.println("Queue's head: " + q.element());

        //print head using peek()
        System.out.println("Queue's head: " + q.peek());
    }
}
