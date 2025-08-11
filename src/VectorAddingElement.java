import java.util.Vector;

public class VectorAddingElement {
    public static void main(String[] args) {
        //Creating a default vector
        Vector  v1 = new Vector();

        //Adding custom element using add() method
        v1.add(1);
        v1.add(2);
        v1.add("geeks");
        v1.add("forGeeks");
        v1.add(3);

        System.out.println("Vector v1 is " + v1);

        //Create generic vector
        Vector<Integer> v2 = new Vector<Integer>();

        //Adding custom elements using add() method
        v2.add(1);
        v2.add(2);
        v2.add(3);
        System.out.println("Vector v2 is " + v2);
    }

}
