import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class AbstractQueueAddingElements {
    public static void main(String[] args) {
        AbstractQueue<Integer> AQ1 = new LinkedBlockingQueue<Integer>();

        // Populating AQ
        AQ1.add(10);
        AQ1.add(20);
        AQ1.add(30);
        AQ1.add(40);
        AQ1.add(50);

        // print AQ
        System.out.println("AbstractQueue contains : " + AQ1);

        // Since AbstractQueue is an abstract class
        // create object using LinkedBlockingQueue

        AbstractQueue<Integer> AQ2 = new LinkedBlockingQueue<Integer>();
        // print AQ2 initially
        System.out.println("AbstractQueue2 initially contains : " + AQ2);
        // adds elements of AQ1 in AQ2
        AQ2.addAll(AQ1);

        System.out.println( "AbstractQueue1 after addition contains : " + AQ2);

    }
}
