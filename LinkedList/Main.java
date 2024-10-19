package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(68);
        list.addFirst(1);
        list.addFirst(4);
        list.addFirst(6);
        list.addFirst(9);
        list.display();
        System.out.println();
        list.addLast(10);
        list.display();
        System.out.println();
        list.addLastWithoutTail(0);
        list.addLastWithoutTail(100);
        list.display();
        System.out.println();
        list.add(2, 4);
        list.display();

        System.out.println("next line");
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(3));
        list.display();

        System.out.println(list.find(4));


    }
}
