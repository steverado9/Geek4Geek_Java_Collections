import java.util.HashSet;

class HashSetForEachMethod {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();

        //Adding elements into the HashSet using add()
        h.add("Geeks");
        h.add("for");
        h.add("Geeks");

        //Iterating over hash set items
        h.forEach(i -> System.out.println(i));
    }
}
