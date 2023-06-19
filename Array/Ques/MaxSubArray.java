package DSA.Array.Ques;

public class MaxSubArray {
    public static void main(String[] args){
        int[] arr = {3,-6,2,4-5,6-1};
        System.out.println(findMaxSubArray(arr));
    }
    static int findMaxSubArray(int[] arr){

        int max_so_far =Integer.MIN_VALUE;
        int max_end_here = 0;
        for (int i = 0; i < arr.length; i++) {
            max_end_here += arr[i];

            if(max_so_far < max_end_here){
                max_so_far = max_end_here;
            }
            if(max_end_here<0){
                max_end_here =0;
            }
        }
        return max_so_far;
    }
}
