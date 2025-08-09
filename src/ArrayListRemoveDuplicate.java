import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveDuplicate {
    //method to remove duplicate from an ArrayList
    public static <T> ArrayList<T> removeDuplicate(ArrayList<T> list) {
        //create a new ArrayList
        ArrayList<T> newList = new ArrayList<T>();

        //Traverse(loop) through the first list
        for (T element : list)  {
            //if this element is not present in newList
            //then add it
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        //Get the arraylist with duplicate values
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
        //print the Arraylist
        System.out.println("ArrayList with duplicates: " + list);

        //Remove duplicates
        ArrayList<Integer> finalList = removeDuplicate(list);

        //print the arraylist with duplicates removed
        System.out.println("ArrayList with dulicates removed: " + finalList);
    }
}
