public class SinglyLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(100);
        Node second = new Node(200);
        Node third = new Node(300);

        head.next = second;
        second.next = third;

        System.out.println("Singly Linked List:");

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
