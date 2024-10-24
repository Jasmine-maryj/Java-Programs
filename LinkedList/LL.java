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

    public void insertRec(int value, int index) {
        head = insert(index, value, head);
    }

    // insert using recursion
    public Node insert(int index, int value, Node node) {
        if (index == 0) {
            Node newNode = new Node(value, node);
            size++;
            return newNode;
        }

        node.next = insert(index - 1, value, node.next);
        return node;
    }

    public void removeDuplicates() {
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public static LL mergeList(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.addLast(f.value);
                f = f.next;
            } else {
                ans.addLast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.addLast(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.addLast(s.value);
            s = s.next;
        }

        return ans;
    }

    public boolean isContainsCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public int findCycleLength(Node head) {
        Node fast = head;
        Node slow = head;

        int cycleLength = 0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                // return true;
                Node temp = slow;

                do {
                    temp = temp.next;
                    cycleLength++;
                } while (temp != slow);

                // while (temp != slow) {
                // temp = temp.next;
                // cycleLength++;
                // }
                return cycleLength;
            }
        }
        return cycleLength;
    }

    public Node firstNodeCycle(Node head) {
        int cycleLength = findCycleLength(head);

        if (cycleLength == 0) {
            return null;
        }

        Node f = head;
        Node s = head;

        while (cycleLength > 0) {
            s = s.next;
            cycleLength--;
        }

        while (f != s) {
            s = s.next;
            f = f.next;
        }
        return s;
    }

    public static boolean isHappyNumber(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }

        return false;
    }

    public Node findMiddleNode(Node head){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public void reverseLinkedList(Node node){
        if(node == tail){
            head = tail;
            return;
        }

        reverseLinkedList(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void reverseLinkedList1(Node head){
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present.next != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }

        head = prev;
    }

    private static int findSquare(int n) {
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
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

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size) {
            return deleteLast();
        }

        Node prevNode = getIndex(index - 1);
        int value = prevNode.next.value;
        prevNode.next = prevNode.next.next;
        size--;
        return value;
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
