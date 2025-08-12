import java.util.Vector;

public class VectorCopyingIntoAVector2 {
    public static void main(String[] args) {
        //creation of vector of Integers
        Vector<Integer> gfg = new Vector<>();

        //adding elements to first vector
        gfg.add(50);
        gfg.add(24);
        gfg.add(95);
        gfg.add(31);

        Vector<Integer> gfg2 = new Vector<>();

        //adding elements to the second Vector
        //by ITERATING OVER ONE BY ONE
        for (Integer value : gfg) {
            gfg2.add(value);
        }

        //Iterating over second vector
        System.out.println("-----Iterating over the second vector-----");

        for(Integer value : gfg2) {
            System.out.println(value);
        }

        //here we changed the third element of the second vector to 23
        //here we will not see the second change in the first
        gfg2.set(2,23);

        System.out.println("third element of first vector = " + gfg.get(2));
        System.out.println("third element of second vector = " + gfg2.get(2));
    }
}
