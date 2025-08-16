import java.util.HashSet;

class HashSetRemoveElement {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        //Adding elements to above Set using add() method
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");
        hs.add("A");
        hs.add("B");
        hs.add("Z");
        System.out.println("HashSet : " + hs);

        //Removing the element B
        hs.remove("B");

        //Print the updated HashSet after removing elements
        System.out.println("HashSet after removing element : " + hs);

        //Returns false if the element is not present
        System.out.println("B exists in Set: " + hs.remove("B"));
    }
}
