import java.util.LinkedHashSet;

public class LinkedHashSetExample1 {
    public static void main(String[] args) {
        //Create a LinkedHashSet of Strings
        LinkedHashSet<String> lh = new LinkedHashSet<>();

        //Adding elements to above set using add() method
        lh.add("Geek");
        lh.add("For");
        lh.add("Geeks");

        System.out.println(lh);
    }
}
