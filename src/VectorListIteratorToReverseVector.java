import java.util.ListIterator;
import java.util.Vector;

public class VectorListIteratorToReverseVector {
// Java Program to traverse the vector elements in backward
// direction using ListIterator
    public static void main(String[] args) {
        //Create a vector of string type
        Vector<String> numbers = new Vector<String>();

        //adding elements to vector
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Four");

        //listIterator method will return the list of
        //String type ListIterator.
        ListIterator<String> listIterator = numbers.listIterator(numbers.size());

        //Iterate the ListIterator using the hasPrevious() method

        while(listIterator.hasPrevious()) {
            //if element exist at previous index, then print that element
            System.out.println(listIterator.previous());
        }
    }
}
