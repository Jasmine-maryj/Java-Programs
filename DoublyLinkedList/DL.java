package DoublyLinkedList;

public class DL {

    private Node head;

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        Node last = head;

        node.next = null;

        if (head == null) {
            head.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;

    }

    public void display() {
        Node temp = head;
        System.out.print("NULL <- ");
        while (temp != null) {
            System.out.print(temp.value + " <=> ");
            temp = temp.next;
        }
        System.out.print(" END ");
    }

    public void displayReverse() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            last = temp;
            temp = temp.next;
        }

        while (last != null) {
            System.out.print(last.value + " <=> ");
            last = last.prev;
        }
        System.out.print("START");
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
