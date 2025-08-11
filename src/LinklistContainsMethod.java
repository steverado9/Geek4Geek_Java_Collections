import java.util.LinkedList;

public class LinklistContainsMethod {
   //we use the contains() method to check if the element is present in the LinkedList or not.
   public static void main(String[] args) {
       LinkedList<String> l = new LinkedList<>();

       //add elements to the list
       l.add("Geeks");
       l.add("for");
       l.add("Geeks");
       l.add("10");
       l.add("20");
       System.out.println("LinkedList: " + l);

       //Check if the list contains "20"
       System.out.println("The List contains '20': " + l.contains("20"));

       //check if the list contains "Hello"
       System.out.println("The list contains 'Hello': " + l.contains("Hello"));

       //check if the list contains "Geeks"
       System.out.println("The List contains 'Geeks': " + l.contains("Geeks"));
   }
}
