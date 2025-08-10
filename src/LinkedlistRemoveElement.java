import java.util.LinkedList;

public class LinkedlistRemoveElement {
    //Remove first and last element in the linked list
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(30);
        list.add(20);
        System.out.println("linkedlist: " + list);

        System.out.println("The remove first element is : " + list.removeFirst());

        // Remove the tail using removeLast()
        System.out.println("The last element is removed: " + list.removeLast());

        //Display the final list
        System.out.println("Final LinkedList: " + list);

        // Remove the tail using removeLast()
        System.out.println("The last element is removed: " + list.removeLast());

        //Display the final list
        System.out.println("Final LinkedList: " + list);


    }
}
