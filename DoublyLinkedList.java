public class DoublyLinkedList {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node first = new Node(50);
        Node second = new Node(100);
        Node third = new Node(150);

        first.next = second;
        second.prev = first;

        second.next = third;
        third.prev = second;

        Node temp = first;

        System.out.println("Doubly Linked List:");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
