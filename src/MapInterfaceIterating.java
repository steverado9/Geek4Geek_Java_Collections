import java.util.HashMap;
import java.util.Map;

class MapInterfaceIterating {
    public static void main(String[] args) {
        //Initialization of a Map using Generics
        Map<Integer, String> hm1 = new HashMap<Integer, String>();

        //Inserting the Elements
        hm1.put(1, "Geeks");
        hm1.put(2, "Geeks");
        hm1.put(3, "Geeks");

        for(Map.Entry mapElement : hm1.entrySet()) {
            int key = (int)mapElement.getKey();
            //Finding the value
            String value = (String)mapElement.getValue();
            System.out.println(key + " : " + value);
        }

    }
}
