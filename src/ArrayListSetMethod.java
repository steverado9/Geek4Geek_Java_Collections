import java.util.ArrayList;

// Handling IndexOutOfBoundsException
public class ArrayListSetMethod {
    public static void main(String[] args) {
        try {
            ArrayList<Integer> n = new ArrayList<>();
            n.add(1);
            n.add(2);
            n.add(3);
            n.add(4);
            n.add(5);
            System.out.println("Before operation: " + n);

            //Replace element at index 3 with 9
            int r = n.set(3, 9);
            System.out.println("After operation: " + n);
            System.out.println("Replaced element: " + r);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }

    }
}
