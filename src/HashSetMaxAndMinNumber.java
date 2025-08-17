import java.util.Collections;
import java.util.HashSet;

class HashSetMaxAndMinNumber {
    public static void main(String[] args) {
        //New HashSet
        HashSet<Integer> set = new HashSet<>();
        // Add data to Hashset
        set.add(10);
        set.add(20);
        set.add(20);
        set.add(10);
        set.add(50);
        set.add(40);

        //Print maximum value using max method of Collection class
        System.out.println("Maximum value of HashSet : " + Collections.max(set));

        //Print minimum value using min method of Collection class
        System.out.println("Minimum value of HashSet : " + Collections.min(set));
    }
}
