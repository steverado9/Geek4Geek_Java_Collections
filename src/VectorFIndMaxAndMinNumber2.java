//importing all classes of java.util package
import java.util.*;

//importing Integer wrapper class for primitive data type
import java.lang.Integer;
public class VectorFIndMaxAndMinNumber2 {
    public static void main(String[] args) {
        //Assign maximum value to minValue Variable
        int minValue = Integer.MAX_VALUE;

        //Assign minimum value to maxValue variable
        int maxValue = Integer.MIN_VALUE;

        //Creating a vector
        Vector<Integer> V = new Vector<Integer>();

        //Adding elements into vector
        V.add(100);
        V.add(30);
        V.add(7);
        V.add(24);
        V.add(13);
        System.out.println("vector elements: " + V);

        //For-each loop to traverse through vector
        //If element is present in vector
        for (Integer i : V) {
            //if greater than maxValue, then update
            if (i > maxValue) {
                maxValue = i;
            }

            //if less than minValue, then update
            if (i < minValue) {
                minValue = i;
            }
        }

        //Print maximum element in the vector
        System.out.println("Maximum Element in vector :" + maxValue);

        //Print minimum element in the vector
        System.out.println("Minimum Element in vector: " + minValue);

    }
}
