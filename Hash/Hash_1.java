package DSA.Hash;
// HashMap is used when there is pair
/* HashMap is implemented in java as an Array of LinkedList
* every index of that array is called a bucket */
import java.util.*;

public class Hash_1 {
    public static void main(String[] args) {
        // country(key)(always unique) Population(value)(unique or not)
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 140);
        map.put("US", 40);
        map.put("China", 130);

        System.out.println(map);

        //update at reinsert
        // non-existing key will get created
        map.put("India", 160);
        System.out.println(map);

        //Search or lookup
        if (map.containsKey("US")){ //contains function is boolean
            System.out.println("present");
        }else {
            System.out.println("not present");
        }
        // Retrieve
        System.out.println(map.get("US"));// Existing key
        System.out.println(map.get("Japan"));// non-Existing key

            // enhanced for loop
        int[] arr = {1,4,6};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int val : arr) {// enhanced version
            System.out.print(val + " ");

        }
        // Iteration in HashMap
        //for(Var_type Var_name : collection )
         for (Map.Entry<String, Integer> var : map.entrySet()) {
             //System.out.println(var + " ");
             // only key can be printed
             System.out.println(var.getKey());
             //only values can be printed
             System.out.println(var.getValue());
         }
        //another type of for loop for only key
        // creating a set of strings named A to save all the keys of my hashmap object (map)
        Set<String> A = map.keySet();
        for (String key : A){
            //System.out.println(key + " "); // only printing the keys
            System.out.println(key + " " + map.get(key));
        }

        //Remove
        map.remove("China");
        System.out.println(map);
    }

}

