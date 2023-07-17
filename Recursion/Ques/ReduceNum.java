package DSA.Recursion.Q;
// given a num , count number of steps to make it 0.
//if gu=iven number is even do num/2 and if odd do num-1
public class ReduceNum {
    public static void main(String[] args) {
        int num = 14;
        int result = StepsReq(num, 0);
        System.out.println(result);
    }
    static int StepsReq(int n , int count){
        if(n==0){
            return count;
        }
        if(n%2==0){
            return StepsReq(n/2,count+1);
        }
        return StepsReq(n-1,count+1);
        //return count;
    }
}
