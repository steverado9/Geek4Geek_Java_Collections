import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueRemoveElement {
    public static void main(String[] args) {
        //Create an instance of ConcurrentLinkedQueue
        ConcurrentLinkedQueue<Integer> q = new ConcurrentLinkedQueue<>();
        // Add Numbers to queue using add(e) method
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println("ConcurrentLinkedQueue: " + q);

        //apply remove() method
        boolean b = q.remove(20);

        System.out.println("number 20 remove sucessfully? : " + b);

        // Displaying the existing ConcurrentLinkedQueue
        System.out.println("Updated ConcurrentLinkedQueue: " + q);
    }
}
