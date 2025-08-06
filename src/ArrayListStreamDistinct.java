//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collector;
//
//public class ArrayListStreamDistinct {
//    //program to remove duplicates from a list in java8
//    public static void main(String[] args) {
//        //input list with duplicates
//        List<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
//        //print the arraylist
//        System.out.println("ArrayList with duplicates: " + list);
//
//        //construct a new list from the set constructed from elements
//        //of the original list
//        List<Integer> newList = list.stream().distinct().collect(Collector.toList());
//
//        //print the ArrayList with duplicates removed
//        System.out.println("ArrayList with duplicates removed: " + newList);
//    }
//}
