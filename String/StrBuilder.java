package DSA.String;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i);
            builder.append(ch);
        }



        // here only one object of the string is created and everytime that is modified
        System.out.println(builder);
        System.out.println(builder.deleteCharAt(1));
        System.out.println(builder.reverse());

        StringBuilder str = new StringBuilder("G_ME");
        System.out.println(str);
        // replacing the "_" with A
        System.out.println(str.replace(1,2,"A"));
        // modifies the str object itself
        System.out.println(str);
        System.out.println(str.reverse());

        StringBuilder str2 = new StringBuilder("ss'nf8r^#%&$!2937ry");
        System.out.println(str2.toString().replaceAll("[^a-zA-Z0-9]",""));


    }
}
