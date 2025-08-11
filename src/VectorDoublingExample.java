import java.util.Vector;

public class VectorDoublingExample {
    public static void main(String[] args) {
        //Vector with initial capacity = 2;
        Vector<Integer> vector = new Vector<>(2);

        //Add elements to trigger capacity increase
        vector.add(10);
        vector.add(20);
        System.out.println("Capacity after adding 2 elements: " + vector.capacity());

        vector.add(30); //Trigger resize (from 2 to 4)
        System.out.println("Capacity after adding 3rd element" + vector.capacity());

        vector.add(40);
        vector.add(50); //Triggers resize again (from 4 to 8)
        System.out.println("Capacity after adding 5 elements: " + vector.capacity());
    }
}
