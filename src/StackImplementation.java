import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        //Create a new stack
        Stack<Integer> s = new Stack<>();

        //Push elements onto the stack
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        //Pop elements from the stack
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    //Elements are added to the stack using the push() method, placing each item on top
    //A loop runs while the stack is not empty, checked using the empty() method.
    //Elements are removed and printed using the pop() method in LIFO order.
}
