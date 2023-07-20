package DSA.Recursion.Ques;
// Sum of digits of a number
public class SumOfDig {
    public static void main(String[] args) {
        //int result = Sum(5510);
        int product = prod(5511);
        //System.out.println(result);
        System.out.println(product);
    }
    public static int Sum(int n){
        if (n % 10 == n) {
            return n;
        }
//       if (n == 0) { //it can be used for sum but not product
//           return n;//this takes an extra check
//        }
        int temp = n%10;
        int next = n/10;
        return temp+ Sum(next);
    }
    static int prod(int n){
        if (n % 10 == n) {
            return n;
        }
        int temp = n%10;
        int next = n/10;
        return temp * prod(next);
    }
}
