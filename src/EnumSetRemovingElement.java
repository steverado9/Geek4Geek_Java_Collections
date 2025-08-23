import java.util.EnumSet;

// Java program to demonstrates the working
// of both remove() and removeAll() Method
class EnumSetRemovingElement {
    //Enum
    enum Game { CRICKET, HOCKEY,TENNIS}

    public static void main(String[] args) {
        //Creating EnumSet using allOf()
        EnumSet<Game> g = EnumSet.allOf(Game.class);

        //Printing the EnumSet
        System.out.println("EnumSet: " + g);

        //Using remove()
        boolean b = g.remove(Game.CRICKET);

        System.out.println("Is CRICKET removed? " + b);

        //using removeAll() and storing the boolean result

        boolean b2 = g.removeAll(g);
        System.out.println("Are all elements removed?" + b2);
    }
}
