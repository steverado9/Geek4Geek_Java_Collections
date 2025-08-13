import java.util.*;
import java.util.stream.Collectors;

public class StackImplementationWithDeque {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Deque<Integer> deque = new ArrayDeque<>();

        stack.push(1);
        deque.push(1);
        stack.push(2);
        deque.push(2);

        List<Integer> list1 = stack.stream().collect(Collectors.toList());
        System.out.println("Using Stack: ");
        for(int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        System.out.println();
    }
}
