import java.util.Vector;

public class VectorUpdatingElement {
    public static void main(String[] args) {
        //Creating an empty Vector
        Vector<Integer> v = new Vector<Integer>();

        //use add() method to add elements in the vector
        v.add(12);
        v.add(23);
        v.add(22);
        v.add(10);
        v.add(20);
        //Display the vector
        System.out.println("Vector: " + v);

        //using set() method to replace 12 with 21
        System.out.println("The object that is replaced is: " + v.set(0, 21));

        //using set() method to replace 20 with 50
        System.out.println("The Object that is replaced is: " + v.set(4, 50));

        System.out.println("The new vector is: " + v);
    }
}
