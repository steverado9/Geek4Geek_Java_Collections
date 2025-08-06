import java.util.ArrayList;

public class ArrayListReverse {
    //Takes an arraylist as a parameter and returns
    //a reversed arraylist
    public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist) {
        //ArrayList for storing reversed elements
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = alist.size() - 1; i >= 0; i++) {
            //Append the element in reverse
            revArrayList.add(alist.get(i));

        }
        //Return the reversed arraylist
        return revArrayList;

        // Iterate through all the elements and print

    }
    public void PrintElements(ArrayList<Integer> alist) {
        for (int i = 0; i < alist.size(); i++) {
            System.out.println(alist.get(i) + " ");
        }
    }
}

class GFG {
    public static void main(String[] args) {
        ArrayListReverse obj = new ArrayListReverse();

        //Declaring arraylist without any initial size
        ArrayList<Integer> arrayli = new ArrayList<Integer>();

        //Appending elements at the end of the list
        arrayli.add(1);
        arrayli.add(2);
        arrayli.add(3);
        arrayli.add(4);

        System.out.println("Elements before reversing: ");
        obj.PrintElements(arrayli);
        arrayli = obj.reverseArrayList(arrayli);
        System.out.println("\nElements after reversing: ");
        obj.PrintElements(arrayli);
    }
}
