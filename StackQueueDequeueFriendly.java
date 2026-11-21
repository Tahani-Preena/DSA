import java.util.LinkedList;
import java.util.Queue;

public class StackQueueDequeueFriendly {

    public static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();

        q1.add(5);
        q1.add(15);
        q1.add(25);

        System.out.println("Current Stack: " + q1);

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        System.out.println(q1.remove() + " removed from stack");

        System.out.println("Remaining Elements: " + q2);
    }
}
