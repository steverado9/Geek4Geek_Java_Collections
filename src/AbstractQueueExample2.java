import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
public class AbstractQueueExample2 {
    public static void main(String[] args) {
        //Creating object of AbstarctQueue<Integer>
        AbstractQueue<Integer> a = new LinkedBlockingDeque<Integer>();

        //Adding elements to the queue
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        //Print the queue contents to the console
        System.out.println("AbstractQueue contains: " + a);
    }
}
