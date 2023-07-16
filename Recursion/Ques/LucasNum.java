package DSA.Recursion.Q;

public class LucasNum {

        // First 2 terms if this series is 2 1
        public static void main(String[] args) {
            int target = 1;// oth term is 2
            System.out.println(Lucas(target));
        }
        static int Lucas(int n){
            //base condition
            if(n==0)
                return 2;
            if (n==1)
                return 1;
            //Recurrence relation
            return Lucas(n-1)+ Lucas(n-2);
        }
    }


