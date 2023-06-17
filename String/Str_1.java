package DSA.String;

public class Str_1 {
    public static void main(String[] args) {
        //word1 & word2 are pointing to the same object in the string pool
        String word1 = " Number";
        String word2 = " Number";
        //word1 = " Roll"; // not changing the string a, making a new string object
        //System.out.println(a+b);

        System.out.println(word1.equals(word2));
        System.out.println(word1 == word2);

        String word3 = new String("team");
        String word4 = new String("team");

        System.out.println(word3==word4); // comparing the references
        System.out.println(word3.equals(word4)); // comparing the values

    }
}
