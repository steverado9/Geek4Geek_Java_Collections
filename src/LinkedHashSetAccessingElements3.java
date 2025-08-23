import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

//java program to get elements by index from LinkedHashSet
//By converting LinkedHashSet to List
class LinkedHashSetAccessingElements3 {
    //main driver method
    public static void main(String[] args) {
        //Creating a LinkedHashSet
        LinkedHashSet<Integer> LHS = new LinkedHashSet<>();

        //Adding elements to LinkedHashSet
        LHS.add(2);
        LHS.add(3);
        LHS.add(4);
        LHS.add(2);
        LHS.add(7);

        //Custom index chosen to retrieve value
        int index = 4; //User-provided index (1-based)

        //step1: Convert LinkedHashSet to List
        List<Integer> LHSList = new ArrayList<>(LHS);

        //step2: Adjust index to zero-based and check bounds
        int zeroBasedIndex = index - 1; //convert to zero-based index
        if(zeroBasedIndex >= 0 && zeroBasedIndex < LHSList.size()) {
            System.out.println("Element at index " + index + " is: " + LHSList.get(zeroBasedIndex));
        } else {
            System.out.println("Index out of bounds");
        }
    }
}
