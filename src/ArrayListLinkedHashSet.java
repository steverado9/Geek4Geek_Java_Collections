import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayListLinkedHashSet {
    //function to remove duplicate from an arraylist
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        //create a new LinkedHashSet
        Set<T> set = new LinkedHashSet<>();

        //Add the elements to set
        set.addAll(list);

        //clear the list
        list.clear();

        //add the elements of set
        //with no duplicates to the list
        list.addAll(set);

        //return the list
        return list;
    }

    public static void main(String[] args) {
        //Get the arrayList with duplicate values
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
        //print the arraylist
        System.out.println("Arraylist with duplicates: " + list);

        //remove duplicates
        ArrayList<Integer> newList = removeDuplicates(list);
        //print the arraylist with duplicates removed
        System.out.println("ArrayList with duplicates removed; " + newList);
    }
}
