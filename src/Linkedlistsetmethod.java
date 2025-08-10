import java.util.LinkedList;

public class Linkedlistsetmethod {
    //With the set method, we can change elements in a LinkedList
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "Geeks");
        System.out.println("Initial LinkedList " + ll);

        ll.set(1, "For");
        System.out.println("Updated LinkedList " + ll);

        //remove element using the remove()
        ll.remove(1);
        System.out.println("After the index Removal " + ll);

        //using the remove method with the value
        ll.remove("Geeks");
        System.out.println("AFter the object Removal" + ll);
    }
}
