
public class Palindrome {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama"; // can be null
        System.out.println(input);
        System.out.println(checkPld(input));
    }

    private static boolean checkPld(String input) {
        input = input.toLowerCase().replaceAll("[^a-zA-Z0-9]",""); //ReGex [^a-zA-Z0-9 ] (regular expression)
        // link removing alphanumeric characters "https://www.techiedelight.com/remove-non-alphanumeric-characters-from-string-java/"
        if (input.equals("0")) {
            return true;
        }
        // reversing the string with library method
        String reverse = new StringBuilder(input).reverse().toString();
        return input.equals(reverse); // .equals return boolean
//        Time complexity: O(N), where N is length of given string.
//        Auxiliary Space: O(N), The extra space is used to store the reverse of the string.
    }
    public boolean isPalindrome(String input) {
        input = input.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int i = 0, j = input.length() - 1;

        while (i < j) {

            if (input.charAt(i) != input.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}

