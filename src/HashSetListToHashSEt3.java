import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetListToHashSEt3 {
    // Set to array using addAll() method.
    public static void main(String[] args) {
        //Create a List
        List<Integer> L = new ArrayList<Integer>();

        //Add values to the List
        L.add(1);
        L.add(4);
        L.add(30);
        L.add(100);
        L.add(15);
        L.add(30);

        Set<Integer> S = new HashSet<Integer>();

        //Use addAll() method
        S.addAll(L);

        //Print values of Set
        System.out.println("HashSet Elements are : ");

        //Create an Object ob that will automatically
        //Identify the type of object of HashSet to iterate through set
        for (Object ob : S) {
            System.out.println(ob);
        }
    }
}
