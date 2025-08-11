import java.util.LinkedList;

public class Linklistclearmethod {
    //Here, we use the clear() method to remove elements from the LinkedList.
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();

        //using add() method to add elements in the linkedlist
        l.add("Geeks");
        l.add("for");
        l.add("Geeks");

        System.out.println("Original LinkedList: " + l);

        //clearing the LinkedList
        l.clear();
        //Accessing the linklist after clearing it
        System.out.println("List after clearing all elements: " + l);
    }
}
