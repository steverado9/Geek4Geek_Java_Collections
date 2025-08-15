import java.util.AbstractList;
import java.util.List;

//How to use abstarctList
public class AbstractListHowTo extends AbstractList<Integer> {
    private int size;

    public AbstractListHowTo(int size) {
        this.size = size;
    }

    @Override
    public Integer get(int index) {
        return index;
    }

    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        List<Integer> list = new AbstractListHowTo(5);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
