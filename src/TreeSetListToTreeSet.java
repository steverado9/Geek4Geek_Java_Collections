import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetListToTreeSet {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        //Add elements
        myList.add("Mango");
        myList.add("Apple");
        myList.add("Grape");
        myList.add("Papaya");
        //Printing ArrayList
        System.out.println("Fruit List : " + myList);

        //Create a TreeSet with the list
        TreeSet<String> tree_set = new TreeSet<>(myList);

        //Print TreeSet
        System.out.println("TreeSet from List: " + tree_set);
    }
}
