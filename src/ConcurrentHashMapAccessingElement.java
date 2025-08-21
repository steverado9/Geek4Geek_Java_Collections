import java.util.concurrent.ConcurrentHashMap;

class ConcurrentHashMapAccessingElement {
    public static void main(String[] args) {
        //Create an instance of ConcurrentHashMap
        ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<Integer, String>();

        //Insert mappings using put method
        m.put(100, "Geeks");
        m.put(101, "for");
        m.put(102, "Geeks");
        m.put(103, "Contribute");

        //Display the value of 100
        System.out.println("The value associated to " + "100 is : " + m.get(100));

        //Getting the value of 103
        System.out.println("The value associated to " + "103 is : " + m.get(103));
    }
}
