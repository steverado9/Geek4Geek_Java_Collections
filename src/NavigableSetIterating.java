import java.util.NavigableSet;
import java.util.TreeSet;

// Java Program to iterate through NavigableSet
class NavigableSetIterating {
    public static void main(String[] args) {
        NavigableSet<String> ts = new TreeSet<String>();
        //Elements are added using add() method
        ts.add("C");
        ts.add("D");
        ts.add("E");
        ts.add("A");
        ts.add("B");
        ts.add("Z");
        //Iterating through the NavigableSet
        for (String i : ts)
            System.out.print(i + ", ");
    }
}
