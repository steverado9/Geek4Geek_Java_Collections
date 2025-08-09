import java.util.ArrayList;

public class ArrayListSubMethodInvalid {
    public static void main(String[] args) {

        //Creating an ArrayList of names
        ArrayList<String> n = new ArrayList<>();
        n.add("Sweta");
        n.add("Gudly");

        try {
            //Trying to create a sublist
            //With invalid indices
            n.subList(1, 5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
