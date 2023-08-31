package DSA.LinkedList;

public class DublyLinkedList {
    private static class Node {
        int data;
        Node next;
        Node previous;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }

    }

    //create a head node
    Node head;

    // Insert i) First

    public void insertFirst(int val){
        Node newNode = new Node(val);
        // If list is empty
        // Assign the new node to head
        if (head == null){
            head = newNode;
            return;
        }
        // if not empty
        head.previous = newNode;
        newNode.previous = null;
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int val){
        // create a new node
        Node newNode = new Node(val);
        // Empty list check
        if (head == null){
            head = newNode;
            return;
        }
        // If not empty
        // Traverse through the list to find the last node
        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }
        // After reaching the last node
        temp.next = newNode;
        newNode.next = null;
        newNode.previous = temp;
    }

    public void deleteFirst(){
        if (head == null) {
            System.out.println("List is empty");
        }
        head = head.next;
        head.previous = null;
    }

    public void deleteLast(){
        if (head == null) {
            System.out.println("List is empty");
        }
        Node secondLastNode = head;
        Node  lastNode = head.next;

        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;

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
}
