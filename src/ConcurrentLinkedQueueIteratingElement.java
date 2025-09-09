import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueIteratingElement {
    public static void main(String[] args) {
        //create an instance of ConcurrentLinkedQueue
        ConcurrentLinkedQueue<String> q = new ConcurrentLinkedQueue<String>();
        // Add String to queue using add(e) method
        q.add("Java");
        q.add("C++");
        q.add("Python");
        q.add("js");
        // Displaying the existing ConcurrentLinkedQueue
        System.out.println("ConcurrentLinkedQueue: " + q);

        // Call iterator() method
        Iterator i = q.iterator();

        //Print elements of iterator
        System.out.println("The String values of iterator are : ");

        while(i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }
}
