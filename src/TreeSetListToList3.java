import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

class TreeSetListToList3 {
    public static void main(String[] args) {
        List<String> fruitlist = new ArrayList<String>();
        fruitlist.add("Mango");
        fruitlist.add("Apple");
        fruitlist.add("Grape");
        fruitlist.add("Papaya");

        //Printing ArrayList
        System.out.println("Fruit List : " + fruitlist);

        //Create a TreeSet
        TreeSet<String> tree_set = new TreeSet<String>();

        //Add all elements in the TreeSet
        tree_set.addAll(fruitlist);

        //print TreeSet
        System.out.println("TreeSet from List : " + tree_set);
    }
}
