import java.util.LinkedList;
import java.util.Queue;

public class StackQueueEnqueueFriendly {

    public static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();

        // Push elements
        q1.add(10);
        System.out.println("10 pushed into stack");

        q1.add(20);
        System.out.println("20 pushed into stack");

        q1.add(30);
        System.out.println("30 pushed into stack");

        // Pop one element
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        System.out.println(q1.remove() + " popped from stack");

        // Display remaining elements
        System.out.println("Remaining elements: " + q2);
    }
}
