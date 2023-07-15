package DSA.Recursion.Ques;
// Tower of hanoi
public class Hanoi {

    static void hanoi(int n, String source, String helper, String destination) {
        if (n == 0) {
            System.out.println("No disk present !!!");
            return;
        }
        if (n == 1) {
            System.out.println("Move disk 1 to " + source + " to " + destination);
            return;
        }
        hanoi(n - 1, source, helper, destination);
        System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);
        hanoi(n - 1, helper, destination, source);

    }
    
    public static void main(String[] args) {

        int n = 4;
        hanoi(n, "A", "B", "C");

    }
}
