import java.util.LinkedHashSet;

// How to merge two LinkedHashSet objects in Java?
public class LinkHashedSetJoiningSets {
    public static void main(String[] args) {
        LinkedHashSet<String> lhSetColors1 = new LinkedHashSet<String>();

        lhSetColors1.add("yellow");
        lhSetColors1.add("white");
        lhSetColors1.add("black");

        LinkedHashSet<String> lhSetColors2 = new LinkedHashSet<String>();
        lhSetColors2.add("yellow");
        lhSetColors2.add("red");
        lhSetColors2.add("green");

        //use addAll method to merge two LinkedHashSet
        lhSetColors1.addAll(lhSetColors2);
        System.out.println("Merged LinkedHashSet: " + lhSetColors1);
    }
}
