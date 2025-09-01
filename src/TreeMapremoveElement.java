import java.util.TreeMap;

class TreeMapremoveElement {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        // Inserting the elements using put() method
        tm.put(3, "Java");
        tm.put(2, "C++");
        tm.put(1, "Pyhton");
        tm.put(4, "JS");
        // Printing all elements of Map
        System.out.println(tm);

        // Removing the element corresponding to key
        tm.remove(4);

        // Printing updated TreeMap
        System.out.println(tm);
    }
}
