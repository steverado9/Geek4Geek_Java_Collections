import java.util.ArrayList;

//Example 1: In this example, we will use the add() method
// to add elements at the end of the list.
public class ArrayListAddMethod {
    public static void main(String[] args) {
        //Creating an empty ArrayList
        ArrayList<Integer> al = new ArrayList<>();

        //use add() method to add elements to the list
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);

        //Adding new element at index 2
        int i = 2;
        al.add(i, 21);
        System.out.println(al);
    }
}
