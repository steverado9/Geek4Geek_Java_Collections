import java.util.HashSet;
import java.util.TreeSet;

public class HashSetsort2 {
    //Converting HashSet to TreeSet.
    public static void main(String[] args) {
        //Creating a HashSet
        HashSet<String> set = new HashSet<String>();

        //Adding elements into HashSet using add()
        set.add("geeks");
        set.add("practice");
        set.add("contribute");
        set.add("ide");
        System.out.println("Original HashSet: " + set);

        //Sorting HashSet using TreeSet
        TreeSet<String> treeSet = new TreeSet<String>(set);

        //Print the sorted elements of the HashSet
        System.out.println("HashSet elements "
                            + "in sorted order "
                            + "using TreeSet: "
                            + treeSet);

    }
}
