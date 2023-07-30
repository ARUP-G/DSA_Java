
//Given an array of integers, print sums of all subsets in it. Output sums can be printed in any order.
//        Examples :
//        Input : arr[] = {2, 3}
//        Output: 0 2 3 5
//
//        Input : arr[] = {2, 4, 5}
//        Output : 0 2 4 5 6 7 9 11

public class SumofSubarray {
    public static void main(String[] args) {
//        int[] arr = {3,4,5};
//        //System.out.println(sum(int[]arr));
//        sum(arr);
        int[] arr = { 5, 4, 3 };
        int n = arr.length;
        int total = 1 << n;

        subsetSums(arr, 0, n - 1, 0);
    }


    static void subsetSums(int[] arr, int l, int r, int sum)
    {

        // Print current subset
        if (l > r) {
            System.out.print(sum + " ");
            return;
        }

        // Subset including arr[l]
        subsetSums(arr, l + 1, r, sum + arr[l]);

        // Subset excluding arr[l]
        subsetSums(arr, l + 1, r, sum);
    }
    //    static void sum(int[] arr){
//        int add= 0;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(" "+arr[i]);
//            add += arr[i];
//            System.out.print(" "+add);
//        }
//        //return add;
//    }
}

