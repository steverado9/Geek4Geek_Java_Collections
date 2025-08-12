import java.util.Vector;

public class VectorToreverseAVector {
    //using a for loop to reverse a vector
    public static void main(String[] args) {
        //creating a vector of string type
        Vector<String> numbers = new Vector<String>();

        //adding elements to vector
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Four");

        //Iterating from index equal to numbers.size() - 1
        //to 0 and decrement index by 1 using the for loop

        for (int index = numbers.size() - 1; index >= 0; index--) {
            System.out.println(numbers.get(index));
        }
    }
}
