import java.util.ArrayList;

class ArrayListOfStringToStringArrayGet {

    //main driver method
    public static void main(String[] args) {
        //Creating an empty ArrayList of String type
        ArrayList<String> al = new ArrayList<String>();

        //Populating the ArrayList by custom elements
        al.add("Anshul Aggarwal");
        al.add("Mayank Solanki");
        al.add("Abhishek Kelenia");
        al.add("Vivek Gupta");

        //creating a string array and giving it a size
        String[] str = new String[al.size()];

        for (int i = 0; i < al.size(); i++) {
            str[i] = al.get(i);
        }

        //Print using for each loop
        for (String k : str) {
            System.out.println(k);
        }
    }
}
