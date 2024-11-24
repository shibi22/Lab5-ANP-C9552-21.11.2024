import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Declare a stack
        Stack<Integer> stack = new Stack<>();
		

        // Store 10 elements in the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        // Display the stack after adding 10 elements
        System.out.println("Stack after pushing 10 elements: " + stack);

        // Remove 4 elements from the stack
				
            for (int j =1; j<5; j++) {
                stack.pop();
            }
        
        // Display the stack after removing 4 elements
        System.out.println("Stack after popping 4 elements: " + stack);
    }
}
