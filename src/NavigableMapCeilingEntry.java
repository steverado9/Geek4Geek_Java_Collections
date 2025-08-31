import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapCeilingEntry {
    public static void main(String[] args) {
        //Declearing the NavigableMap of Integer and String
        NavigableMap<Integer, String> navmap = new TreeMap<>();

        //assigning the values in the NavigableMap
        //using put()
        navmap.put(2, "two");
        navmap.put(7, "seven");
        navmap.put(3, "three");

        //use of ceilingEntry()
        //returns 7 = seven (next greater key-value)
        System.out.println("The next greater key-value of 5 is : " + navmap.ceilingEntry(5));

        //returns "null" as no value present
        //greater than or equal to number
        System.out.println("The next greater key-value of 8 is : " + navmap.ceilingEntry(8));
    }
}
