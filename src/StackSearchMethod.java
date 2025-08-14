import java.util.Stack;

public class StackSearchMethod {
    public static void main(String[] args) {
        //creating empty stack
        Stack<String> STACK = new Stack<>();

        //Stacking strings
        STACK.push("Geeks");
        STACK.push("4");
        STACK.push("Geeks");
        STACK.push("Welcomes");
        STACK.push("You");

        //Displaying the stack
        System.out.println("The stack is: " + STACK);

        //checking for the element "4"
        System.out.println("Does the stack contains '4'? " + STACK.search("4"));

        //Checking for the element "Hello"
        System.out.println("Does the stack contains 'Hello'?" + STACK.search("Hello"));

        //Checking for the element "Geeks"
        System.out.println("Does the stack contains 'Geeks'? " + STACK.search("Geeks"));
    }
}
