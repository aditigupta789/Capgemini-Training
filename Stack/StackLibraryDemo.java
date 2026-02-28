package Stack;

import java.util.Stack;

public class StackLibraryDemo {

    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();

        stack.push(10);
        stack.push(20);

        System.out.println("Top: "+stack.peek());

        stack.pop();

        System.out.println(stack);
    }
}