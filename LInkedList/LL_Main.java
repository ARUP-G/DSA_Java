package DSA.LInkedList;

public class LL_Main {
    public static void main(String[] args) {

        LinkList list1 = new LinkList();

        //add in front
        list1.addFirst("A");
        list1.addFirst("B");
        list1.addFirst("D");
        list1.addFirst("E");
        //adding to the last
        list1.addLast("A1");

        list1.display();
        list1.getSize();

        //Delete
        list1.deleteFirst();
        list1.display();
        list1.getSize();

        list1.deleteLast();
        list1.display();
        list1.getSize();



        //Insert (in middle) -> O(1)

        //Search -> O(n)

        //Singular linked list
        // H->[]->[]->N
    }
}
