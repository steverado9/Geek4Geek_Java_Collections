import java.util.TreeSet;

class TreeSetExample {
    public static void main(String[] args) {
        //Create an empty TreeSet
        TreeSet<String> ts = new TreeSet<String>();

        //Elements are added using add() method
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");
        ts.add("welcomes");
        ts.add("you");
        System.out.println("Tree set is " + ts);

        String check = "Welcomes";

        //check if the above string exsits in
        //the treeset or not
        System.out.println("Contains : " + check + " " + ts.contains(check));

        //Print the last element in the TreeSet
        System.out.println("Last Value " + ts.last());

        String value = "Geek";
        //FInd the values just greater
        //and smaller than the above string
        System.out.println("Highter " + ts.higher(value));
        System.out.println("Lower " + ts.lower(value));
    }
}
