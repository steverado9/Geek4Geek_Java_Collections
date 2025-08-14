import java.util.Stack;

public class StackIsEmpty {
    public static void main(String[] args) {
        //Creating an empty stack
        Stack<String> STACK = new Stack<String>();

        //stacking strings
        STACK.push("Geeks");
        STACK.push("4");
        STACK.push("Geeks");
        STACK.push("Welcomes");
        STACK.push("You");

        //Displaying the stack
        System.out.println("The stack is: " + STACK);

        //checking for the emptiness of the stack
        System.out.println("Is the stack empty? " + STACK.empty());

        // Popping out all the elements
        STACK.pop();
        STACK.pop();
        STACK.pop();
        STACK.pop();
        STACK.pop();

        //checking for the emptiness of the stack
        System.out.println("Is the stack empty? " + STACK.empty());
    }
}
