package Stack;

import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        System.out.println(stack.empty());
        System.out.println(stack.peek());
    }
}
