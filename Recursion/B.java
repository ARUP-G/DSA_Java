package DSA.Recursion;

public class B {
    public static void main(String[] args) {
        int n =5;
        printhh(n);

    }
    public static void printhh(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        printhh(n-1);
    }
    public static void reversePrint(int n){
        if (n==0) {
            return;
        }
        reversePrint(n-1);
        System.out.println(n);
        
    }
}
