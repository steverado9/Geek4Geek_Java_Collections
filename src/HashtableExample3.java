import java.util.Hashtable;

class HashtableExample3 {
    public static void main(String[] args) {
        //No need to mention the
        //Generic type twice
        Hashtable<Integer, String> ht1 = new Hashtable<>(4);

        // Initialization of a Hashtable
        // using Generics
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>(2);

        //Inserting ELements
        //using put() method
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");
        // Print mappings to the console
        System.out.println("Mappings of ht1: " + ht1);
        System.out.println("Mapping of ht2 : " + ht2);
    }

}
