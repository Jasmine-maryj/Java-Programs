package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void addLast(int value) {
        Node node = new Node(value);
        if (tail == null) {
            addFirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void addLastWithoutTail(int value) {
        Node temp = head;

        if (temp == null) {
            addFirst(value);
            return;
        }

        Node node = new Node(value);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        size += 1;
    }

    public void add(int value, int index) {
        if (index == 0) {
            addFirst(value);
            return;
        }
        if (index == size) {
            addLast(value);
            return;
        }
        Node temp = head; // reference

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(value, temp.next); // new Node
        temp.next = newNode;
        size++;
    }

    // deletion in linked list
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        tail = head;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = getIndex(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size){
            return deleteLast();
        }

        Node prevNode = getIndex(index - 1);
        int value = prevNode.next.value;
        prevNode.next = prevNode.next.next;
        size--;
        return value;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node getIndex(int index) {
        Node temp = head;
        for (int i = 0; i <= index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
