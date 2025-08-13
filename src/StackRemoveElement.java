import java.util.Stack;

public class StackRemoveElement {
    public static void main(String[] args) {
        //Creating an empty stack
        Stack<Integer> stack = new Stack<Integer>();

        //use add() method to add elements
        stack.push(10);
        stack.push(15);
        stack.push(30);
        stack.push(20);
        stack.push(5);

        System.out.println("Initial Stack: " + stack);

        //Remove elements using pop() method
        System.out.println("Popped element: " + stack.pop());
        System.out.println("popped element: " + stack.pop());

        //Displaying the stack after pop operation
        System.out.println("Stack after pop operation" + stack);

        System.out.println("Is stack empty? " + stack.empty());

        //pop remaining elements
        stack.pop();
        stack.pop();
        stack.pop();

        //Check if the stack is empty
        System.out.println("Is stack empty? " + stack.empty());
    }
}
