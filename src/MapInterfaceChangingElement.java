import java.util.HashMap;
import java.util.Map;

class MapInterfaceChangingElement {
    public static void main(String[] args) {
        Map<Integer, String> hm1 = new HashMap<Integer, String>();

        //Inserting the Elements
        hm1.put(1, "Geeks");
        hm1.put(2, "Geeks");
        hm1.put(3, "Geeks");
        System.out.println("Initial Map: " + hm1);

        hm1.put(2, "For");
        System.out.println("Updated Map: " + hm1);

    }
}
