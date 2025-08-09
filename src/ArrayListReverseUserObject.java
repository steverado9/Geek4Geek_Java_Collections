import java.util.ArrayList;
import java.util.Collections;

class Employee {
    int empID;
    String empName;
    String deptName;

    //Constructor for initializing the class variables
    public Employee(int empID, String empName, String deptName) {
        this.empID = empID;
        this.empName = empName;
        this.deptName = deptName;
    }
}

public class ArrayListReverseUserObject {
    public static void main(String[] args) {
        //Declaring arraylist without any initial size
        ArrayList<Employee> arrayli = new ArrayList<Employee>();

        //Creating user defined objects
        Employee emp1 = new Employee(123, "Rama", "Facilities");
        Employee emp2 = new Employee(124, "Lakshman", "Transport");
        Employee emp3 = new Employee(125, "Raven", "Packing");

        //Appending all the objects for arraylist
        arrayli.add(emp1);
        arrayli.add(emp2);
        arrayli.add(emp3);

        System.out.println("Elements before reversing: ");
        printElements(arrayli);

        //Collections.reverse method takes a list as a parameter and reverse it
        Collections.reverse(arrayli);
        System.out.println("Elements after reversing: ");
        printElements(arrayli);
    }
    //iterating through all the elements and print
    public static void printElements(ArrayList<Employee> alist) {
        for (int i = 0; i < alist.size(); i++) {
            System.out.println("EmpID:" + alist.get(i).empID +
                    ", EmpName:" + alist.get(i).empName +
                    ", Department:" + alist.get(i).deptName);
        }
    }
}
