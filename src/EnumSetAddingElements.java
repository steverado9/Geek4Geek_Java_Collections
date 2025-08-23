import java.util.EnumSet;

//Java program to demonstrate the
//working of both add and addAll() method
class EnumSetAddingElements {
    //Enum
    enum Game {CRICKET, HOCKEY, TENNIS}

    public static void main(String[] args) {
        //Creating an EnumSet
        //using allOf()
        EnumSet<Game> g1 = EnumSet.allOf(Game.class);

        //Creating an EnumSet
        //Using nonOf()
        EnumSet<Game> g2 = EnumSet.noneOf(Game.class);

        //using add() method
        g2.add(Game.HOCKEY);

        //Printing the elements to the console
        System.out.println("EnumSet using add(): " + g2);
    }
}
