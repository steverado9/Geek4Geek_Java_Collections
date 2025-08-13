import java.util.Stack;

public class StackPeek {
    // Here, we are using peek() to access the top element of the stack.
    public static void main(String[] args) {
        //Creating an empty stack
        Stack<String> stack = new Stack<String>();

        //use push() to add elements into the stack
        stack.push("Welcome");
        stack.push("To");
        stack.push("Geeks");
        stack.push("FOr");
        stack.push("Geeks");

        //Displaying the stack
        System.out.println("Initial stack: " + stack);

        //Fetching the element at the head of the stack
        System.out.println("The element at the top of the stack is: " + stack.peek());
        System.out.println("Final stack: " + stack);
    }
}
