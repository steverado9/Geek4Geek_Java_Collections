import java.lang.classfile.constantpool.IntegerEntry;
import java.util.Iterator;
import java.util.LinkedHashSet;

// Java Program to Get Elements by Index from LinkedHashSet
// Using iteration count method
class LinkedHashSetAccessingElements {
    //Main driver method
    public static void main(String[] args) {
        //Adding elements to linkedHashSet
        LinkedHashSet<Integer> LHS = new LinkedHashSet<>();
        LHS.add(2);
        LHS.add(3);
        LHS.add(4);
        LHS.add(2);
        LHS.add(7);
        //Custom index chosen to get the element
        //present at that index
        int index = 4;

        Iterator<Integer> it = LHS.iterator();

        //Assigning initial values
        int currIndex = 0;
        Integer CurrentElement = null;

        //Condition check using hasNext(), which
        //return true if another token as input
        while(it.hasNext()) {
            //next element using iterator is
            //assigned to variable
            CurrentElement = it.next();

            //Variable condition check
            if (currIndex == index - 1) {
                System.out.println("Element at index " + index + "is : " + CurrentElement);
                break;
            }
            //If condition fails, so
            //Incrementing current index
            currIndex++;
        }

    }
}
