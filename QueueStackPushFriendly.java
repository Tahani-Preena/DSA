import java.util.Stack;

public class QueueStackPushFriendly {

    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        // Add items to queue
        stack1.push(10);
        System.out.println("10 added to queue");

        stack1.push(20);
        System.out.println("20 added to queue");

        stack1.push(30);
        System.out.println("30 added to queue");

        // Remove items from queue
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        System.out.println(stack2.pop() + " removed from queue");
        System.out.println(stack2.pop() + " removed from queue");
    }
}
