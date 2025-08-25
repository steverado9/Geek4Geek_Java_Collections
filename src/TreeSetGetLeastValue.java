//// Two auxiliary classes are required
//// Class1- Sorting logic class invoking comparator
//// Class2- Element class
//// Class3 - Main class(Implementation class)
//
//import javax.lang.model.element.Element;
//import java.util.Comparator;
//import java.util.TreeSet;
//
//// Class1- Sorting logic where
//// comparator holds the sorting logic
//class TreeSetGetLeastValue implements Comparator<Element> {
//    @Override
//    //Overiding
//    //To provide the sorting logic below created TreeSet
//    //in main() method using compare method
//    public int compare(Element e1, Element e2) {
//        //Condition check
//        //Comparing values of element
//        if (e1.getvalue() > e2.getvalue()) {
//            //If condition holds true
//            return 1;
//        } else {
//            //If condition is false
//            return -1;
//        }
//    }
//}
////class 2
////key for TreeSet --> Name
//class Element1 {
//    //Member variable of this class
//    private String name;
//    private int value;
//
//    //Constructor of this class
//    public Element1(String n, int s) {
//        //Referring to same object
//        //using this keyword
//        this.name = n;
//        this.value = s;
//    }
//    // key--> Name
//    // Using name as a key for TreeSet
//    public String getname() { return name; }
//
//    //Return value for the given key(name)
//    public int getvalue() { return value; }
//
//    //Format in which output is returned
//    public String toString() {
//        return "element: " + this.name + ", value: " + this.value;
//    }
//}
//
////Main class - Implementing sorting functionality
//class GFG {
//    //Main driver method
//    public static void main(String[] args) {
//        //Implementinf sorting functionality with Treeset
//        //by implementing comparator and
//        //calling (mySort) from TreeSet constructor
//
//        //creating an onject of TreeSet
//        //where object type is Element
//        TreeSet<Element1> Tree = new TreeSet<>(new MySort());
//
//        // Adding elements to adobe object of TreeSet
//        // Custom inputs
//        Tree.add(new Element("A", 36778));
//        Tree.add(new Element("B", 456456));
//        Tree.add(new Element("C", 76433));
//        Tree.add(new Element("D", 4564));
//
//        System.out.println(Tree.first());
//    }
//}
