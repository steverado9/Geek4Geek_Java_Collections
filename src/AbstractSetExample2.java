// Java program demonstrating the
// working of a protected constructor
// in an abstract class

// Abstract class with a protected constructor
abstract class AbstractSetExample2 {

    //Protected constructor cannot be called directly from outside the class
    protected AbstractSetExample2() {
        System.out.println("AbstractSet constructor called");
    }

    //Abstract method to be implemented by subclasses
    public abstract void display();
}

//Concrete subclass extending AbstractSet
class mySet1 extends AbstractSetExample2 {
    //Constructor for MySet
    public mySet1() {
        //calls the protected constructor of AbstractSet
        super();
        System.out.println("MySet constructor called");
    }
    //Implemetation of the abstract display method
    @Override
    public void display() {
        System.out.println("Displaying elements in MySet");
    }
}

class Geeks2 {
    public static void main(String[] args) {
        //We cannot Instantiate AbstractSet directly
        //because it is an abstract class
        //AbstractSet set = new AbstractSet();
        //This would cause a compile-time error

        //creating an instance of myset2, which is a subclass of AbstractSet
        mySet1 set = new mySet1();

        //calling the sidplay method of mySet
        set.display();
    }
}

