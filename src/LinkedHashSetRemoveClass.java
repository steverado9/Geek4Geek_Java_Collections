import java.util.LinkedHashSet;

public class LinkedHashSetRemoveClass {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        //adding elements
        set.add("Welcome");
        set.add("To");
        set.add("Geeks");
        set.add("4");
        set.add("Geeks");

        //Displaying the LinkedHashSet
        System.out.println("LinkedHashSet: " + set);

        //Removing elements using remove() method
        set.remove("Geeks");
        set.remove("4");
        set.remove("Welcome");

        //Displaying the LinkedHashSet after removal
        System.out.println("LinkedHashSet after removing elements: " + set);
    }
}
