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

    public void add(int afterValue, int value) {
        Node node = new Node(value);
        Node p = find(afterValue);
        if (p == null) {
            System.out.println("value does not exists");
            return;
        }

        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }

    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
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
