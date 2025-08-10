import java.util.LinkedList;

public class LinkListExample {
    //Main driver method
    public static void main(String[] args) {
        //creating a linkedlist
        LinkedList<String> l = new LinkedList<String>();

        //Adding elements to the LinkedList using add() method
        l.add("One");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        l.add("Five");

        //Print the LinkedList
        System.out.println(l);
    }
}
