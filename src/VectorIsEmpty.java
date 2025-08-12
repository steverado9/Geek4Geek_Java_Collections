import java.util.Vector;

public class VectorIsEmpty {
    // Java code to illustrate isEmpty()
    public static void main(String[] args) {
        //Creating an empty vector
        Vector<String> vec_tor = new Vector<String>();

        //use add() method to add elements into the vector
        vec_tor.add("Welcome");
        vec_tor.add("To");
        vec_tor.add("Geeks");
        vec_tor.add("4");
        vec_tor.add("Geeks");

        //Display the Vector
        System.out.println("Vector: " + vec_tor);

        //Verifying if the Vector is empty or not
        System.out.println("Is the vector empty? " + vec_tor.isEmpty());

        //Clearing the vector
        vec_tor.clear();

        //Displaying the vector
        System.out.println("Vector after clear(): " + vec_tor);

        //verifying if the vector is empty or not
        System.out.println("Is the vector empty? " + vec_tor.isEmpty());
    }
}
