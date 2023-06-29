package DSA.Recursion;

public class C {
    public static void main(String[] args) {
        int start=1;
        int end =5;
        print(start);
    }
    public static void print(int n){
        //int end=5;
        if (n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
