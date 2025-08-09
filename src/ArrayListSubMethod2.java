import java.util.ArrayList;
import java.util.List;

public class ArrayListSubMethod2 {
    public static void main(String[] args) {

        //Creating an Arraylist of numbers
        ArrayList<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        n.add(5);

        //Creating a sublist
        List<Integer> s = n.subList(1, 4);

        //Modifying the sublist
        s.set(0, 9); //updating the first element in sublist
        s.remove(2); //Removing the last element in sublist

        System.out.println("Original List After Modification: " + n);
        System.out.println("Modified Sublist: " + s);
    }
}

//Explanation
// In the above example, we have created the original list starts with 5 elements i.e. [1, 2, 3, 4, 5].
//The sublist created using subList(1, 4) contains 3 elements [2, 3, 4]
//After modifications, the original list becomes [1, 9, 3, 5], and the sublist becomes [9, 3].
