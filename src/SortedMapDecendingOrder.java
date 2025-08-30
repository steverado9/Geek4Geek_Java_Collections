import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDecendingOrder {
    public static void main(String[] args) {
        SortedMap<String, String> tm = new TreeMap<String, String>(new Comparator<String>() {
            public int compare (String a, String b) {
                return b.compareTo(a);
            }
        });
        //Adding Elements into the
        //TreeMap using put()
        tm.put("India", "1");
        tm.put("Australia", "2");
        tm.put("South Africa", "3");

        System.out.println(tm);

        //Removing items from TreeMap
        //using remove()
        tm.remove("Australia");
        System.out.println("Map after removing Element: " + tm);
    }
}
