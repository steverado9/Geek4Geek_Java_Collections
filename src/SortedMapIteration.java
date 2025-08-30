import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class SortedMapIteration {
    public static void main(String[] args) {
        //Initialization of a SOrtedMap
        //using Generics
        SortedMap<Integer, String> tm = new TreeMap<Integer, String>();

        //Inserting the Elements
        tm.put(3, "Geeks");
        tm.put(2, "For");
        tm.put(1, "Geeks");

        for (Map.Entry mapELement : tm.entrySet()) {
            int key = (int)mapELement.getKey();

            //Finding the value
            String value = (String)mapELement.getValue();

            System.out.println(key + " : " + value);
        }
    }
}
