import java.util.ArrayList;

class ArrayListOfStringToStringArrayToArray {

    //Main driver method
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        //Populating the ArrayList by custom elements
        al.add("Anshul Aggarwal");
        al.add("Mayank Solanki");
        al.add("Abhishek Kelenia");
        al.add("Vivek Gupta");

        //Converting above list to array using toArray()
        //method and storing it in a string array
        String k[] = al.toArray(new String[al.size()]);

        //Iterating over above string array
        for (String str : k ) {
            //Printing the elements in above array
            System.out.println(str);
        }
    }
}
