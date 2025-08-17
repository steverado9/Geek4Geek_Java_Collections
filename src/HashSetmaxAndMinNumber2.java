import java.util.HashSet;

public class HashSetmaxAndMinNumber2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Add data to Hashset
        set.add(10);
        set.add(20);
        set.add(20);
        set.add(10);
        set.add(50);
        set.add(40);

        int max = -1, min = -1;

        //iterate HasSet to get Maximum value
        for (int val : set) {
            if (max == -1) {
                max = val;
            } else if (val > max) {
                max = val;
            }
        }
        //iterate HashSet to get Minimum value
        for (int val : set) {
            if (min == -1) {
                min = val;
            } else if (val < min) {
                min = val;
            }
        }

        //Print Maximum value using max method of Collection class
        System.out.println("Maximum value of HashSet : " + max);

        //Print Maximum value using max method of Collection class
        System.out.println("Minimum value of HashSet: " + min);
    }
}
