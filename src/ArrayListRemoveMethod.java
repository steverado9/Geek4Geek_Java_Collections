import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListRemoveMethod {
    public static void main(String[] args) {
        //Creating an object of List interface with
        //reference to ArrayList class
        List<Integer> al = new ArrayList<>();

        //Adding elements to our ArrayList
        //using add() method
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(5);
        al.add(70);
        al.add(26);
        System.out.println(al);

        //Method 1
        //This makes a call to remove(index)
        //remove element 20
        al.remove(1);

        //now element 30 is moved one position back
        //so element 30 is removed this time
        al.remove(1);

        //Method 2
        //This makes a call to remove(object) and remove element 1
        al.remove(Integer.valueOf(1));

        //Method3
        //Using Iterator.remove() method
        //creating an iterator object
        Iterator itr = al.iterator();

        // Holds true till there is single element
        // remaining in the object
        while (itr.hasNext()) {
            //Remove elements smaller than 10 using
            //iterator.remove()
            int x = (Integer)itr.next();
            if (x < 10) {
                itr.remove();
            }
        }

        //print the updated array
        System.out.println(al);

    }
}
