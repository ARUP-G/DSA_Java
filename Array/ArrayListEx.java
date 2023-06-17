package DSA.Array_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Syntax
        //ArrayList<Data Type> array list name = creating new arrayList using constructor
        ArrayList<Integer> list = new ArrayList<>(5);
        // We can have an initial size of the array list
       list.add(23);
       list.add(2);
       list.add(223);
       list.add(273);
       list.add(253);
       list.add(243);

       System.out.println(list.contains(2));
       System.out.println(list.indexOf(0)); // find the element in array
       System.out.println(list); // it also calls toString method
       list.set(0,20);
       list.remove(3);
       System.out.println(list);
        //input
        for (int i = 0; i <5 ; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i <5 ; i++) {
            list.add(list.get(i)); //get item at any index
        }
        System.out.println(list);
    }
}
// User for dynamically allocate array size
// It is like vector form cpp
// here size of the array is internally fixed but
// when array size exceeds the initial size
// New array is created by the arraylist enlarging the size of the previous array.
// then elements of the previous array gets copied to new one.