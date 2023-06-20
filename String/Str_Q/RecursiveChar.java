
public class RecursiveChar {
    public static void main(String[] args) {
        String in = "aabbc";
        System.out.println(removeConsecutiveCharacter(in));

    }

    static String removeConsecutiveCharacter(String S) {

        String snew = S.toLowerCase();
        StringBuilder sb = new StringBuilder(snew);
        int i = 1;
        int j = i - 1;

        while (i < sb.length()) {
            if (sb.charAt(i) == sb.charAt(j)) {
                sb.deleteCharAt(i);
                //snew = sb.toString();
            }
            i++;
            j++;
        }
        return sb.toString();
    }

}
