import java.util.ArrayList;
import java.util.List;

public class ArrayListSubList {
    public static void main(String[] args) {

        //Create an ArrayList of flowers
        ArrayList<String> l = new ArrayList<>();
        l.add("Rose");
        l.add("Lotus");
        l.add("Lavender");
        l.add("Lilly");
        l.add("Sunflower");

        //Extracting a sublist
        List<String> s = l.subList(1, 4);

        //Printing the original list and sublist
        System.out.println("" + l);
        System.out.println("" + s );
    }
}
