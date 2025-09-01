import java.util.TreeMap;

class TreeMapAddingElements {
    public static void main(String[] args) {
        //Initialization of TreeMap without generics (raw type)
        TreeMap<Integer, String> tm = new TreeMap<>();

        //Insertion the elements in TreeMap using put() method
        tm.put(3, "Geeks");
        tm.put(2, "For");
        tm.put(1, "Geeks");

        //Printing the TreeMap with raw type
        System.out.println("TreeMap with raw type: " + tm);

        //Initialization of TreeMap with Generics
        TreeMap<Integer, String> tm1 = new TreeMap<>();

        //Inserting elements into tm1
        tm1.put(3, "Language");
        tm1.put(2, "Programming");
        tm1.put(1, "Java");

        //Printing the TreeMap with generics
        System.out.println("TreeMap with generics: " + tm1);
    }
}
