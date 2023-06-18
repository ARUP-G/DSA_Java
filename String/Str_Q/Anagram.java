package DSA.String.Str_Q;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "cat";
        String ss = "Ana gram";
        String tt = "N agaram";

        System.out.println(isAnagram(s,t));
        System.out.println(isAnagram(ss,tt));

    }
    public static boolean isAnagram(String s, String t) {
        // no need to replace spaces
        if(s.length() != t.length()){
            return false;
        }else{
            char[] s1 = s.toLowerCase().toCharArray();
            char[] t1 = t.toLowerCase().toCharArray();

            Arrays.sort(s1);
            Arrays.sort(t1);
            return Arrays.equals(s1,t1);
        }
    }
}
