public class ArrayCircularQueue {

    public static void main(String[] args) {

        int[] queue = new int[5];
        int front = 0;
        int rear = 0;

        queue[rear++] = 11;
        queue[rear++] = 22;
        queue[rear++] = 33;

        System.out.println("Queue Elements:");

        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
        System.out.println(queue[front++] + " removed");
    }
}
