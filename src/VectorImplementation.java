import java.util.Vector;

public class VectorImplementation {
    public static void main(String[] args) {
        //Create a new Vector
        Vector<Integer> v = new Vector<>(3, 2);

        //Add elements to the vector
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);

        //Insert an element at index 1
        v.insertElementAt(0, 1);

        //Remove the element at index 2
        v.removeElement(2);

        //Print the elements of the vector
        for (int i : v) {
            System.out.println(i);
        }

        Vector<String> vec = new Vector<>();
        System.out.println("Default Capacity:" + vec.capacity());
    }
}
