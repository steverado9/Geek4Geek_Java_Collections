// Importing all classes of java.util package
import java.util.*;
public class VectorFindingMaxAndMinElement {
    // Java Program to Find minimum and maximum elements from a Vector

    public static void main(String[] args) {
        //Creating(defining) a vector
        Vector<Integer> v = new Vector<Integer>();

        //Add elements in Vector
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);

        //Printing all elements of vector
        System.out.println("Vector elements: " + v);

        //using inbuilt function to find minimum number
        //using Collection.min() method
        int minNumber = Collections.min(v);

        //Finding maximum number using Collection.max() method
        int maxNumber = Collections.max(v);

        //Print max element of the vector
        System.out.println("Maximum Number in Vector is: " + maxNumber);

        //Print min element of the vector
        System.out.println("Minimum Number in Vector is : " + minNumber);
    }
}
