import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class HashSetListToHashSet4 {
    public static void main(String[] args) {
        //create a list
        List<String> L = new ArrayList<String>();

        //Add values to the list
        L.add("Rohan");
        L.add("Ritik");
        L.add("Yogesh");
        L.add("Sangeeta");
        L.add("Palak");
        L.add("Laxmi");

        //create a stream from List and convert it into a set
        Set<String> S = L.stream().collect(Collectors.toSet());

        //Print values of set
        System.out.println("HashSet Elements are :");

        //createan object ob that will automatically
        // identify the type of object of HashSet to iterate
        // through set
        for (String ob : S) {
            System.out.println(ob);
        }

    }
}
