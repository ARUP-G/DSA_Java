
// Write a function to find the longest common prefix string amongst an array of strings.
//        If there is no common prefix, return an empty string "".

//        Example 1:
//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"

 class LongestCommPrefix {
    public static void main(String[] args) {
        String[] str= {"ilm","flow" ,"flower"};
        String check = check(str);
        System.out.println(check);

    }

    static String check(String[] str){
        if (str == null) {
            return " ";
        }
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            // checking for the prefix(string) != str[i] (running till the substrings of both prefix(string) & str[i] is equal)
            while(str[i].indexOf(prefix) !=0){
                // removing last letter from the string till checking both strings to equal
                prefix = prefix.substring(0, prefix.length()-1);
                // if no letter gets matched
                if (prefix.isEmpty()) {
                    return " ";
                }
            }
        }
        return prefix;
    }


}
