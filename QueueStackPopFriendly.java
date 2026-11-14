import java.util.Stack;

public class QueueStackPopFriendly {

    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        // Add first item
        stack1.push(50);
        System.out.println("50 added to queue");

        // Add second item
        stack2.push(stack1.pop());
        stack1.push(100);
        stack1.push(stack2.pop());
        System.out.println("100 added to queue");

        // Add third item
        stack2.push(stack1.pop());
        stack2.push(stack1.pop());
        stack1.push(150);
        stack1.push(stack2.pop());
        stack1.push(stack2.pop());
        System.out.println("150 added to queue");

        // Remove items
        System.out.println(stack1.pop() + " removed from queue");
        System.out.println(stack1.pop() + " removed from queue");
    }
}
