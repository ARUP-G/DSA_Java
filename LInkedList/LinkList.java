package DSA.LInkedList;

public class LinkList { // Linked list class
    //nodes-> data + next(pointer/reference)
    private static class Node{
         String data;
         Node next;
        //node constructor
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // var (items of the LinkList class)
    private Node head; // This represents the starting node of a LinkedList
    //private Node tail;
    private int size;

    LinkList(){
        this.size=0;
    }


    // (A) Add -> i) First ii) Last
    public void addFirst(String data){
        // 1) Make a new node that holds the data you want to add.
        Node newNode = new Node(data); //here newNode is just a box with the data inside.
        // 2) Check if the list is present or not (if the head is present or not).
        if(head == null){
            // as there is no head make the newNode as head (make a linked list).
            head  = newNode;
            size++;  // empty list is adding 1 node
            return;
        }
        // 3)if  linked list is not empty
        newNode.next = head; // making the existing head-node as next-node
        head = newNode; // making the newNode as new head
        size++;  // if not empty then adding also
    }
     public  void addLast(String data){
         // 1) Make a new node that holds the data you want to add.
         Node newNode = new Node(data); //here newNode is just a box with the data inside.
         // 2) Check if the list is present or not (if the head is present or not).
         if(head == null){
             // as there is no head make the newNode as head (make a linked list).
             head  = newNode;
             size++; // empty list is adding 1 element
             return;
         }
         // 3) If the LinkedList is not empty
         // make a temporary node that resembles head of the LinkedList
         Node temp = head;
         // 4) Traverse through the LinkedList
         while (temp.next != null){ //till we reach the last node
            temp = temp.next; // make the immediate next node as temporary node
         }
         // As we reach to the end of the LinkedList
         //5) Make the last node as the newNode
         temp.next = newNode;
         size++;
     }
     // (B) Delete -> i) First ii) Last
    public void deleteFirst(){
        // 1) If the list is empty
        if(head == null){
            System.out.println("List is empty");
        }
        // 2) Make the next node of head as head of ll
        head = head.next;
        size--;
    }
    public void deleteLast(){
        // 1) If the list is empty
        if(head == null){
            System.out.println("List is empty");
        }
        // 2) If single element is present in the list
        if(head.next == null){
            head = null;
            return;
        }
        size--;
        // 3)  Make a secondLast node lastNode
        Node secondLast = head;
        Node lastNode = head.next;
        // 4) Traverse through the list till we find the last node
        while(lastNode.next != null){
            // update the lastNode and secondLast node
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        // 5) Make the secondLast node as last node of list
        secondLast.next = null;
    }
    public void display() {
        // 1) Check if the LinkedLIst is empty
        if (head == null) {
            System.out.println("List is empty");
        }
        else {
            // 2) Make a temporary node as head
            Node temp = head;
            // 3) Till we reach the last node present
            while (temp != null) {
                // if not the last node
                System.out.print(temp.data + "->");
                // Update the next node as the temporary node
                temp = temp.next;
            }
            // As we reach at the last node
            System.out.println("End");
        }
    }
    public void getSize(){
        System.out.println(size);
    }
}
// Corner case -> A condition which is a spatial case
// exp: Null linkedList

// It is of variable size
// Non-contiguous memory

// Usages
// IF the requirement of the program is to insert again & again
//
