import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverseCollection {
    public static void main(String[] args) {
        //Declating arraylist without any initial size
        ArrayList<Integer> arrayli = new ArrayList<Integer>();

        //Appending elements at the end of the list
        arrayli.add(Integer.valueOf(9));
        arrayli.add(Integer.valueOf(145));
        arrayli.add(Integer.valueOf(875));
        arrayli.add(Integer.valueOf(343));
        arrayli.add(Integer.valueOf(5));
        System.out.println("Elements before reversing: ");
        printElements(arrayli);

        //Collections.reverse method takes a list as a parameter
        //and reverses the passes paremeter(no new array is required)
        Collections.reverse(arrayli);
        System.out.println("\nElements after reversing: ");
        printElements(arrayli);
    }

    public static void printElements(ArrayList<Integer> alist) {
        for (int i = 0; i < alist.size(); i++) {
            System.out.println(alist.get(i) + "");
        }
    }
}
