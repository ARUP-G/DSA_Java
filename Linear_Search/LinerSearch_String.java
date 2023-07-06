//package DSA.Linear_Search;

import java.util.Arrays;

public class LinerSearch_String {
    public static void main(String[] args) {
        String str = "Arup Das";
        char find = 'B';
        System.out.println(StringCharSearch(str,find));
        System.out.println(StringCharSearch2(str,find));
        //StringCharCSearch_foreach(str,find);
        System.out.println(Arrays.toString(str.toCharArray()));
    }
    static boolean StringCharSearch(String input,char target) {
        if (input.length() == 0) {
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            if (target == input.charAt(i)) {
                return true;
            }
        }
        return false;
    }
        static boolean StringCharSearch2(String input,char target){
        for (char tar : input.toCharArray()){
            if (tar == target){
                return true;}
        }
        return false;
    }

}
