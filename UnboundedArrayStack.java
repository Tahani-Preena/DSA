import java.util.ArrayList;

public class UnboundedArrayStack {

    public static void main(String[] args) {

        ArrayList<Integer> stk = new ArrayList<Integer>();

        // Push elements
        stk.add(10);
        System.out.println("10 pushed into stack");

        stk.add(20);
        System.out.println("20 pushed into stack");

        stk.add(30);
        System.out.println("30 pushed into stack");

        // Display stack
        System.out.println("Current Stack: " + stk);

        // Pop elements
        int removed1 = stk.remove(stk.size() - 1);
        System.out.println(removed1 + " popped from stack");

        int removed2 = stk.remove(stk.size() - 1);
        System.out.println(removed2 + " popped from stack");

        // Display remaining stack
        System.out.println("Stack after pop operations: " + stk);
    }
}
