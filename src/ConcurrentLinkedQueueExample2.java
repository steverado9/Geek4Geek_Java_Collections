import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample2 {
    public static void main(String[] args) {
        //Create a ConcurrentLinkedQueue
        //using ConcurrentLinkedQueue() constructor

        ConcurrentLinkedQueue<Integer> q = new ConcurrentLinkedQueue<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        //Displaying the existing ConcurrentLinkedQueue
        System.out.println("ConcurrentLinkedQueue: " + q);

        //Create a ConcurrentLinkedQueue
        //using ConcurrentLinkedQueue(Collection c)
        //constructor
        ConcurrentLinkedQueue<Integer> q1 = new ConcurrentLinkedQueue<>(q);

        //Displaying the existing ConcurrentLinkedQueue
        System.out.println("ConcurrentLinkedQueue1: " + q1);
    }
}
