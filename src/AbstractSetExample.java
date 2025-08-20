import java.util.HashSet;
import java.util.Set;

// Java Program to demonstrates the
// working of AbstractSet class
abstract class AbstractSetExample {
    //Abstract method to insert an element
    public abstract void insert (int element);

    //Abstract method to display the elements
    public abstract void display();
}

class mySet extends AbstractSetExample {
    //Set to hold the elements
    private Set<Integer> elements;

    //Constructor
    public mySet() {
        elements = new HashSet<>();
    }

    //Implement the insert method
    public void insert(int element) {
        elements.add(element);
    }

    //Implement the display method
    public void display() {
        for (Integer element : elements) {
            System.out.println(element);
        }
    }
}

class Geeks {
    public static void main(String[] args) {
        mySet s = new mySet();

        //Insert elements
        s.insert(10);
        s.insert(20);
        s.insert(30);

        //Display elements
        System.out.println("Elements in the set:");
        s.display();
    }
}
