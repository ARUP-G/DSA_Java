package DSA.LInkedList;
import java.util.LinkedList;
public class Collection_ll {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Add
        list.add("A");
        list.add("B");
        list.add("C");

        // Add by index
        list.add(1,"F");

        // Print
        System.out.println("List: "+list);

        // Retrieve
        // By index
        System.out.println("Element at index 1: "+list.get(1));

        // By position
        System.out.println("First element: "+list.getFirst());
        System.out.println("Last element: "+list.getLast());

        // Shows head by default
        System.out.println("Peek: "+list.peek());
        // Shows head
        System.out.println("Peek first:"+list.peekFirst());
        // Shows tail
        System.out.println("Peek Last:"+list.peekLast());


        // Delete
//        list.remove("F");
        System.out.println(list);
        
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);


        System.out.println(list);



        // Check
        System.out.println(list.contains("A"));


    }
}
