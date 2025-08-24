import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetListToTreeSet2 {
    public static void main(String[] args) {
        //Create new List
        List<String> fruitlist = new ArrayList<>();
        fruitlist.add("Mango");
        fruitlist.add("Apple");
        fruitlist.add("Grape");
        fruitlist.add("Papaya");
        //Printing ArrayList
        System.out.println("Fruit List : " + fruitlist);

        //Create a TreeSet
        TreeSet<String> tree_set = new TreeSet<String>();

        //Add each element in the TreeSet
        for (String value : fruitlist) {
            tree_set.add(value);
        }
        //Print TreeSet
        System.out.println("TreeSet from list : " + tree_set);
    }
}
