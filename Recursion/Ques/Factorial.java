package DSA.Recursion.Q;
//Factorial of a number
public class Factorial {
    public static void main(String[] args) {
        int factorial = fact(5);
        System.out.println(factorial);
    }
    public static int fact(int n){
        if (n == 1) {
            return 1;
        }
        return n * fact(n-1);
    }
}
