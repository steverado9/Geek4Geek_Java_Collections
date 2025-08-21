import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

//This example demonstrates how CopyOnWriteArraySet allows thread-safe modification and iteration,
//where elements can be added by a child thread and safely iterated without causing concurrency issues or exception.
class CopyOnwriteArraySetExample2 extends Thread{
    static CopyOnWriteArraySet<String> s = new CopyOnWriteArraySet<>();

    public void run() {
        //Child thread trying to add
        //new element in the Set object
        s.add("D");
    }

    public static void main(String[] args) {
        //Adding elements using add() method
        s.add("A");
        s.add("B");
        s.add("C");

        //We create a child thread that is
        //going to modify CopyOnWriteArraySet s
        CopyOnwriteArraySetExample2 t = new CopyOnwriteArraySetExample2();

        //Running the child thread
        //using start() method
        t.start();

        //Try block to check for exceptions
        try{
            //Waiting for the thread to add the element
            //Join ensures that main thread waits for the child thread to finish
            t.join();
        } catch (InterruptedException e){
            System.out.println("Child thread interrupted.");
        }
        System.out.println("Set after child thread modification: " + s);

        //Now we iterate through the CopyOnWriteArraySet
        //and we won't get any exception.
        Iterator<String> itr = s.iterator();

        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);

            if (str.equals("c")) {
                //You cannot remove an element directly
                //using the iterator's remove() so instead

                //we can use remove() method of CopyOnWriteArraySet

                //Removing element c
                s.remove(str);
            }
        }
        System.out.println("FInal Set: " + s);
    }
}
