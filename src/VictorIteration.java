import java.util.Vector;

public class VictorIteration {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        // Add elements using add() method
        v.add("Geeks");
        v.add("Geeks");
        v.add(1, "For");

        // Using the Get method and the for loop
        for (int i = 0; i < v.size(); i++) {

            System.out.print(v.get(i) + " ");
        }

        System.out.println();


        for (String str : v)
            System.out.print(str + " ");

    }
}
