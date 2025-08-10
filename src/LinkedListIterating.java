import java.util.LinkedList;

public class LinkedListIterating {
    //iterate through the elements in a linked list
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "For");

        //usig the get method and for loop
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }

        //using the for each loop
        for (String str : ll){
            System.out.println(str);
        }

    }
}
