package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DL list = new DL();
        list.insertFirst(69);
        list.insertFirst(100);
        list.insertFirst(101);
        list.display();
        System.out.println();

        list.displayReverse();

        System.out.println();
        list.insertLast(45);
        list.display();

        System.out.println();
        list.add(100, 0);
        list.display();
    }
}
