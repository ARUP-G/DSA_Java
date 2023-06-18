package DSA.String;

public class Performance {
    public static void main(String[] args) {
        String series = " ";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i); // casting to char
            series += ch;
        }
        System.out.println(series);
        // Here the solution is very bad as it is storing a+b -> ab+c -> abc+d ->....->  abcdefghijklmnopqrstwxy + z
        // so everytime a new string is being made with same reference var
        // taking time s O(n^2) [1+2+3...+n]
        // Solution is to use a String Builder
    }
}
