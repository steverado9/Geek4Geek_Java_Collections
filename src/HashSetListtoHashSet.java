import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// Java program to demonstrate conversion of
// list to set using constructor
class HashSetListtoHashSet {
    public static void main(String[] args) {
        //Create List
        List<String> L = new ArrayList<String>();
        //Add values to the List
        L.add("Aragorn");
        L.add("Gandalf");
        L.add("Legolas");
        L.add("Frodo");

        //create a set and pass List object as parameter
        HashSet<String> S = new HashSet<String>(L);

        //Print values of Set
        System.out.println("HashSet Elements are : ");

        //since the set is of string type, create a string
        for (String ob : S) {
            System.out.println(ob);
        }
    }
}
