package DSA.Recursion.Q;

public class PellSequence {
    // First 2 terms if this series is 2 1
    public static void main(String[] args) {
        int target = 10;// oth term is 2
        System.out.println(Pell(target));
    }
    static int Pell(int n){
        //base condition
        if(n<3)
            return n;
        //Recurrence relation
        return 2* Pell(n-1)+ Pell(n-2);
    }
}
//Time Complexity: O(2n) i.e exponential time complexity.
//Auxiliary Space: O(n)
