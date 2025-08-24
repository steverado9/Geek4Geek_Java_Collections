import java.util.*;

class TreeSetStringBuffer {
    public static void main(String[] args) {
        //Creating a TreeSet with a custom comparator
        Set<StringBuffer> ts = new TreeSet<>(new Comparator<StringBuffer>(){
            @Override
            public int compare(StringBuffer sb1, StringBuffer sb2) {
                return sb1.toString().compareTo(sb2.toString());
            }
        });

        //Adding elements to the TreeSet
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("Z"));
        ts.add(new StringBuffer("L"));
        ts.add(new StringBuffer("B"));
        ts.add(new StringBuffer("O"));
        ts.add(new StringBuffer("1"));

        //Printing the elements
        System.out.println(ts);
    }
}
