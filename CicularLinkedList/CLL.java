package CicularLinkedList;

public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            tail = node;
            head = node;
            return;
        }

        tail.next = node;
        tail = node;
        node.next = head;
    }

    public void display() {
        Node temp = head;

        if (head != null) {
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while (temp != head);
        }

        System.out.println();
    }

    public void delete(int value) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (node.value == value) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.value == value) {
                node.next = n.next;
            }
            node = node.next;
        } while (node != head);
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

}
