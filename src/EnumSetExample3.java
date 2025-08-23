import java.util.EnumSet;

// Java Program to demonstrates the
// working of EnumSet.allOf() method
class EnumSetExample3 {
    //Enum
    enum Game { CRICKET, HOCKY, TENNIS }

    public static void main(String[] args) {
        //Creating an EnumSet using allOf()
        EnumSet<Game> g = EnumSet.allOf(Game.class);

        //Printing EnumSet elements to the console
        System.out.println("EnumSet: " + g);
    }
}
