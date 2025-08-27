import java.util.*;

public class HashtableExample6 {
    public static void main(String[] args) {
        //Create an empty Hashtable
        Hashtable<String, Integer> ht = new Hashtable<>();

        //Add elements to the hashtable
        ht.put("vishal", 10);
        ht.put("sachin", 30);
        ht.put("vaibhav", 20);

        //Print size and content
        System.out.println("Size of map is: " + ht.size());
        System.out.println(ht);

        //check if a key is present and if
        //present , print value
        if (ht.containsKey("vishal")) {
            Integer a = ht.get("vishal");
            System.out.println("Value for key \"vishal\" is: " + a);
        }
    }
}
