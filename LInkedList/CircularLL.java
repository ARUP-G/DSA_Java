package DSA.LInkedList;

public class CircularLL {
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    public void addFirst(int val){

        Node newNode = new Node(val);

        if (head == null) {
           head = newNode;

           return;
        }
        //if not null
        head.next = newNode;
        newNode.next = head;

    }

    public void display(){
        if (head == null) {
            System.out.println("List is empty");
        }
        else{
        Node temp = head;
            while(temp.next != null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("End");
        }
    }
}
