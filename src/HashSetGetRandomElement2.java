import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class HashSetGetRandomElement2 {
    // Java program to get random elements from HashSet
    // using an Iterator
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(11);
        hs.add(24);
        hs.add(34);
        hs.add(43);
        hs.add(55);
        hs.add(66);
        hs.add(72);
        hs.add(80);
        hs.add(99);
        System.out.println("Random element: " + getRandomElement(hs));
    }

    private static <E> E getRandomElement(Set<? extends E> set) {
        Random random = new Random();
        //Generate a random number using nextInt
        //method of the Random class.
        int randomNumber = random.nextInt(set.size());

        Iterator<? extends E> iterator = set.iterator();

        int currentIndex = 0;
        E randomElement = null;

        //iterate the HashSet
        while (iterator.hasNext()) {
            randomElement = iterator.next();
            //if current index is equal to random number
            if (currentIndex == randomNumber) {
                return randomElement;
            }
            //increase the current index
            currentIndex++;
        }
        return randomElement;
    }
}
