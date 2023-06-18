package DSA.String;
// Operator overloading is only available for '+' operator for String concatenation/joining
import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a');
        System.out.println('b');
        System.out.println('a'+'b'); // printing the askey values addition
        System.out.println("a"+"b");
        System.out.println('a'+1);
        System.out.println("a"+1);//here the integer will call toString() method
        // string will convert objects
        System.out.println("SS"+ new ArrayList<>()); // complex object
        System.out.println("sss" + new Integer(58)); // complex object
        //System.out.println(new Integer(99) + new ArrayList<>()); // + operator is only usable when one or more object is a string type here both are complex obj
        String ans = new Integer(44) + " " + new ArrayList<>(); // if we use 1 string then we can print
        System.out.println(ans); // if one of the data type is string the output will be string
    }
}
