import java.util.TreeMap;

class TreeMapChangeElement {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        //Inserting elements in Map using put() method
        tm.put(3, "Geeks");
        tm.put(2, "Geeks");
        tm.put(1, "Geeks");

        // Print all current elements in map
        System.out.println(tm);

        // Inserting the element at specified
        // corresponding to specified key
        tm.put(2, "For");

        // Printing the updated elements of Map
        System.out.println(tm);



    }
}
