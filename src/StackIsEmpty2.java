import java.util.Stack;

public class StackIsEmpty2 {
    //java code to demonstrate Traversal in stack with empty() method
    public static void main(String[] args) {
        Stack<Integer> STACK = new Stack<>();
        // Stack Pushing Elements
        STACK.push(23);
        STACK.push(3);
        STACK.push(-30);
        STACK.push(13);
        STACK.push(45);

        //Displaying the stack
        System.out.println("The stack is: " + STACK);

        //Initialize sum variable which will store sum of all element
        int sum = 0;

        //popping till stack is not empty
        while (!STACK.empty()) {
            sum += STACK.pop();
        }

        //print sum
        System.out.println("The sum of Elements is " + sum);

        //Check for the emptiness of stack
        System.out.println("Is the stack empty? " + STACK.empty());
    }
}
