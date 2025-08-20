import java.util.Arrays;
import java.util.Set;
import java.util.stream.*;

//Convert Array to HashSet in Java
public class HashSetArrayToHashSet2 {
    //Generic function to convert array to set
    public static <T> Set<T> convertArrayToSet(T array[]) {
        //create a set from the array
        return Arrays.stream(array).collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        //Create an Array
        String array[] = {"Geeks", "forGeeks", "A computer Portal" };

        //Print the Array
        System.out.println("Array: " + Arrays.toString(array));

        //convert the array to set
        Set<String> set = convertArrayToSet(array);

        //print the set
        System.out.println("Set: " + set);
    }
}
