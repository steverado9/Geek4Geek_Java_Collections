import java.util.concurrent.ConcurrentSkipListSet;

//Java Program to demonstrate the working of
//ConcurrentSkipListSet
public class ConcurrentSkipListSetExample {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> s = new ConcurrentSkipListSet<>();

        //Adding elements
        s.add(10);
        s.add(20);
        s.add(30);

        //Display the set
        System.out.println("Set: " + s);
    }
}
