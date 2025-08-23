import java.util.LinkedHashSet;

public class LinkedHashSetAccessingElements2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> LHS = new LinkedHashSet<>();
        LHS.add(2);
        LHS.add(4);
        LHS.add(5);
        LHS.add(9);
        LHS.add(7);

        // Custom index chosen from LinkedHashSet
        int index = 4;

        //Converting LinkedHashMap to Array
        Integer[] LHSArray = new Integer[LHS.size()];
        LHSArray = LHS.toArray(LHSArray);

        //Print desired value at index in array,
        System.out.println("Element at index " + index + " is : " + LHSArray[index - 1]);
    }
}
