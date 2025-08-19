import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class HashSetArrayToHashSet {
    //Function to convert array to set
    static Set<Integer> convert (int[] array) {
        //HashSet initialisation
        Set<Integer> Set = new HashSet<>();

        //Iteration using enhanced for loop
        for(int element : array) {
            Set.add(element);
        }
        //returning the set
        return Set;
    }
    //Function to print the set
    static void print(Set<Integer> Set) {
        //Implement iterator to the set
        Iterator<Integer> _iterator = Set.iterator();

        //Iterate the elements of Set
        while (_iterator.hasNext()) {
            //print the element of the Set
            System.out.print(_iterator.next() + " ");
        }
    }
    //main function
    public static void main(String[] args) {
        //Array taken for consideration
        int array[] = {1, 2, 3, 4, 5, 6};

        //calling function to convert the array
        Set<Integer> Set = convert(array);

        //print the set
        print(Set);
    }
}
