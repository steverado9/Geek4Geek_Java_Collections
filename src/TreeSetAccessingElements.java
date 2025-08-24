import java.util.NavigableSet;
import java.util.TreeSet;

class TreeSetAccessingElements {
    public static void main(String[] args) {
        //Creating a NavigableSet object with reference
        //to TreeSet class
        NavigableSet<String> ts = new TreeSet<>();
        //Add Elements
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");

        //Printing the elements inside the TreeSet object
        System.out.println("TreeSet is " + ts);

        String check = "Geeks";

        //Check if the above string exists in the treeSet or not
        System.out.println("Contains " + check + " "
                            + ts.contains(check));
        //Print the first element in the TreeSet
        System.out.println("First value " + ts.first());

        //Print the last element in the TreeSet
        System.out.println("Last Value " + ts.last());

        String val = "Geek";
        //Find the values just geater and smaller than the above string
        System.out.println("Higher " + ts.higher(val));
        System.out.println("Lower " + ts.lower(val));
    }
}
