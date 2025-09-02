import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterfaceExample {
    public static void main(String[] args) {
        //Create a Deque of Strings
        Deque<String> d = new ArrayDeque<>();

        d.addFirst("1");
        d.addFirst("2");

        String f = d.removeFirst();
        String l = d.removeFirst();

        //Display the Deque
        System.out.println("First: " + f + ", Last: " + l);
    }
}
