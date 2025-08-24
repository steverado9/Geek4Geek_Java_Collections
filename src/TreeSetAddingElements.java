import java.util.Set;
import java.util.TreeSet;

public class TreeSetAddingElements {
    public static void main(String[] args) {
        //creating a Set interface with reference to TreeSet class
        Set<String> ts = new TreeSet<>();
        //ELement are added using add() method
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");

        //Print all elements inside objects
        System.out.println(ts);
    }
}
