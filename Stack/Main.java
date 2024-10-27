package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

//        1. Add items in stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

//        2. Remove item from stack
        stack.pop();

//        3. Access the top item from stack, does not remove it
        System.out.println("Top of stack - " + stack.peek());

//        4. Check if stack is empty
        if (stack.isEmpty())
            System.out.println("Stack is empty");
    }
}
