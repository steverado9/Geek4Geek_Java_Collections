import java.util.Vector;

public class VectorRemovingElement {
    public static void main(String[] args) {
        //Create a default vector of capacity 10
        Vector v = new Vector();

        // Add elements using add() method
        v.add(1);
        v.add(2);
        v.add("Geeks");
        v.add("forGeeks");
        v.add(4);
        System.out.println("Before removal: " + v);

        //Removing first occurence element at 1
        v.removeElement(1);

        System.out.println("After removal: " + v);

    }
}
