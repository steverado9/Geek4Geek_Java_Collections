import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class HashSetListAToHashSet2 {
    public static void main(String[] args) {
        //Create a list
        List<Integer> L = new ArrayList<Integer>();

        //Add values to the List
        L.add(1);
        L.add(4);
        L.add(30);
        L.add(100);
        L.add(15);
        L.add(30);

        //Create a Set and pass List object as parameter
        HashSet<Integer> S = new HashSet<Integer>();

        //add each elemnt of the list into the set
        for (Integer ob : L) {
            S.add(ob);
        }

        //Print values of set
        System.out.println("HashSet Elements are : ");

        //Create an Object that will automatically
        //identify the type of object of HashSet to iterate through set
        for (Object ob : S) {
            System.out.println(ob);
        }
    }
}
