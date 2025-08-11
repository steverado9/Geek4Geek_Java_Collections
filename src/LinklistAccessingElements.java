import java.util.LinkedList;

public class LinklistAccessingElements {
    //Here, we use the get() method to retrieve an element at a specified index.
    //throw an IndexOutOfBoundsException, if we try to retrieve the element at an Invalid Index.
    public static void main(String[] args) {

        //Creating an empty LinkedList
        LinkedList<String> l = new LinkedList<>();

        //use add() method to add elements in the list
        l.add("Geeks");
        l.add("for");
        l.add("Geeks");
        l.add("10");
        System.out.println(l);

        try {
            //fetching the specified element from the list
            System.out.println("The element at index 3 is: " + l.get(3));

            //fetch from an index greater than the array length
            String a = l.get(5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: IndexOutOfBounds");
        }
    }
}
