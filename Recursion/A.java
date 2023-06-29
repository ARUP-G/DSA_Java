package DSA.Recursion;

public class A {
    // public static void callRe(int n) {
    // if (n == 6) { // Base Case
    // return;
    // }
    // System.out.println(n);
    // callRe(n + 1); // recursion call
    // }

    // public static void printSum(int i, int n, int sum) {
    // if (i > n) {
    // System.out.println(sum);
    // return;
    // }
    // sum += i;
    // printSum(i + 1, n, sum);

    // }
    static int fibo(int n) { // fibonachi number
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        // callRe(1);
        // printSum(1, 5, 0);
        System.out.println(fibo(7));
    }
}
