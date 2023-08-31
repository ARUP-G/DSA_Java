package DSA.LInkedList;

public class DLL_main {
    public static void main(String[] args) {
        DublyLinkedList list = new DublyLinkedList();


        list.insertFirst(9);
        list.insertFirst(8);
        list.insertFirst(7);
        list.insertFirst(3);

        list.insertFirst(1);

        list.insertLast(10);

        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();
    }
}
