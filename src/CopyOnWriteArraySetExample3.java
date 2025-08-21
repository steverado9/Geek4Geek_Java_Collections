import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

//Example 3
//This example demonstrates how to iterate over a CopyOnWriteArraySet
//showing that it allows re-iteration without causing concurrency issues
//even after elements are added.
class CopyOnWriteArraySetExample3 {
    public static void main(String[] args) {
        //Create an instance of CopyOnWriteArraySet
        CopyOnWriteArraySet<String> s = new CopyOnWriteArraySet<>();

        //Adding elements using add() method
        s.add("GeeksForGeeks");

        //Creating an iterator after adding the elements
        Iterator<String> i = s.iterator();

        //Display message
        System.out.println("Set contains");

        //Printing the contents of the set to the console
        while(i.hasNext()) {
            System.out.println(i.next());
        }

        //Reinitialize the iterator
        //to start iteration again
        i = s.iterator();

        System.out.println("Set contains after re-iteration:");

        //Printing the elements to the console
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
