import java.util.Comparator;
import java.util.TreeMap;

class TreeMapObject {
    int rollno;
    String name, address;

    //Constructor to initialize student details
    public TreeMapObject(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    //Override the toString() method to print student details
    public String toString() {
        return this.rollno + " " + this.name + " " + this.address;
    }
}

//Comparator class to define how to compare two TreeMapObjects
//based on their roll number
class SortByRoll implements Comparator<TreeMapObject> {
    public int compare(TreeMapObject a, TreeMapObject b) {
        //Compare based on roll number
        return a.rollno - b.rollno;
    }
}

class Geekss {
    public static void main(String[] args) {
        //Create a TreeMap using a Comparator to sort
        //student objects by roll number
        TreeMap<TreeMapObject, Integer> tm = new TreeMap<>(new SortByRoll());

        //Add students to the TreeMap with their roll numbers as keys
        tm.put(new TreeMapObject(111, "Geek1", "New York"), 1);
        tm.put(new TreeMapObject(131, "Geek2", "London"), 2);
        tm.put(new TreeMapObject(121, "Geek3", "Paris"), 3);

        //Print the TreeMap, Which is automatically
        //sorted by roll number
        System.out.println("TreeMap sorted by roll number: " + tm);
    }
}
