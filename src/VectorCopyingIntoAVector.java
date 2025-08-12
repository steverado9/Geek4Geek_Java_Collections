import java.util.Vector;

public class VectorCopyingIntoAVector {
    // Java Program for copying one Vector to another
    // by passing in the constructor
    public static void main(String[] args) {
        //Creating a Vector of Integers
        Vector<Integer> gfg = new Vector<>();

        //adding elements to first Vector
        gfg.add(11);
        gfg.add(22);
        gfg.add(24);
        gfg.add(39);

        //passing in the constructor
        Vector<Integer> gfg2 = new Vector<>(gfg);

        //Iterating over second vector
        System.out.println("----Iterating over the second vector----");

        for(Integer value : gfg2) {
            System.out.println(value);
        }

        //here we can change the third element in the second vector to 23
        gfg2.set(2,23);

        System.out.println("third element of first vector =" +gfg.get(2));
        System.out.println("third element of second vector =" +gfg2.get(2));
    }
}
