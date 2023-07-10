package DSA.Recursion.Q;

public class fibo {
    // First 2 terms if this series is 0 1
    public static void main(String[] args) {
        int target = 4;// oth term is 0
        System.out.println(fibonacci(target));
    }
    static int fibonacci(int n){
        //base condition
        if(n<2){
            return n;
        }
        //Recurrence relation
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
