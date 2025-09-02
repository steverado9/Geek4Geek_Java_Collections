import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
public class AbstractQueueExample {
    public static void main(String[] args) {
        //Creating object of AbstractQueue<Integer>
        AbstractQueue<Integer> a = new LinkedBlockingDeque<Integer>();

        //Adding element
        a.add(1);
        a.add(2);
        a.add(3);

        System.out.println("AbstarctQueue: " + a);
    }
}
