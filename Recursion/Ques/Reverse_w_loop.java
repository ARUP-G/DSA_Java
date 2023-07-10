package DSA.Recursion.Q;

public class Reverse_w_loop {
    public static void main(String[] args) {
    int number = 15499;
    int reversed_number = reverser(number);
    System.out.println(reversed_number);
    }
    public static int reverser(int num) {
        int rev = 0;
        while (num != 0) {
            int dig = num % 10;
            rev = rev * 10 + dig;
            num /= 10;  //num = num/10;
        }
        return rev;
    }
}
