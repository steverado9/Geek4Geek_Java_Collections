import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class StackIsEmptyForErrorHandling {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        //read data from file
        try {
            File file = new File("data.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                stack.push(line);
            }
            scanner.close();
        } catch(FileNotFoundException e) {
            System.out.println("File not found.");
        }

        //check if stack is empty
        if (stack.empty()) {
            System.out.println("File is empty.");
        } else {
            System.out.println("File is not empty. stack contents:");
            while(!stack.empty()) {
                System.out.println(stack.pop());
            }
        }
    }
}
