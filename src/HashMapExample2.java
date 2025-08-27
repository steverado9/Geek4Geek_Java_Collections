import java.util.HashMap;

class HashMapExample2 {
    public static void main(String[] args) {
        //No need to mention the Generics type twice
        HashMap<Integer, String> hm1 = new HashMap<>(10);

        //Initialization of a HashMap using Generics
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>(2);

        //Adding elements to object of HashMap using put method
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");

        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");
        //Printing elements of HashMap1
        System.out.println("Mappings of HashMap hm1 are : " + hm1);

        //Printing elements of HashMap2
        System.out.println("Mapping of HashMap hm2 are : " + hm2);
    }
}
