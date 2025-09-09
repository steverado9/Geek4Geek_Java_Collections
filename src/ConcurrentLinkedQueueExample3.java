//Java Program to demonstrate the
//working of peek(), poll(), size()
import java.util.concurrent.*;
class ConcurrentLinkedQueueExample3 {
    public static void main(String[] args) {
        //Create a ConcurrentLinkedQueue
        //using ConcurrentLinkedQUeue()
        //constructor
        ConcurrentLinkedQueue<Integer> q = new ConcurrentLinkedQueue<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println("ConcurrentLinkedQueue: " + q);

        //Displaying the first element
        //using peel() method
        System.out.println("First Element is: " + q.peek());

        //Remove and display the first element
        //using poll() method
        System.out.println("Head Element is: " + q.poll());

        //Displaying the existing ConcurrentLinkedQueue
        System.out.println("ConcurrentLinkedQueue: " + q);

        //Get the size using size() method
        System.out.println("Size: " + q.size());
    }
}
