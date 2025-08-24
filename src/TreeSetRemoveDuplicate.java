import java.util.Arrays;
import java.util.TreeSet;

// Java Program to remove duplicates entries
// from  an Array using TreeSet
public class TreeSetRemoveDuplicate {
    public static void main(String[] args) {
        //Input custom entries in an array
        //string type
        //custom inputs
        String[] input = new String[] {
                "Hello","hi", "Wow", "cute", "thanks",
                "hi", "Aww", "cute", "baby", "beloved", "Aww"
        };
        //Converting Array to String and printing it
        System.out.println("Initial Sting Arrray(Containg Duplicates): "
        + (Arrays.toString(input)));

        //Creating an object of TreeSet
        TreeSet<String> dupliCheckr = new TreeSet<>();

        //Adding array elements in TreeSet
        for (String element : input) {
            //Displaying duplicate entries
            if (!dupliCheckr.add(element)) {
                //Print and display elements in an array
                //which are duplicated
                System.out.println("Duplicate Data entered: " + element);
            }
        }
        //Print and display elements in an array
        //after removing duplicates from it.
        System.out.println("TreeSet(After Removing Duplicates): "
        + dupliCheckr);

        //Getting size of TreeSet using size() method
        int length = dupliCheckr.size();

        //Converting above TreeSet to arrays
        //Using toArray() method
        input = dupliCheckr.toArray(input);

        //Iterating over array elements
        for (int i = length; i < input.length; i++) {
            //Print and display above string array
            //after removing duplicate entries from it
            System.out.println("Final string Array is : "
            + Arrays.toString(input));
        }

    }
}
