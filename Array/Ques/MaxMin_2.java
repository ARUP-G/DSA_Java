
import java.util.Arrays;
//using sorting
// time complexity = O(n log n)
// Space complexity = o(1) as using sorting s no extra space

public class MaxMin_2 {
    public static void main(String[] args) {
        int[] arr = {};
        int size = arr.length;
        MaxMin result = getMaxMin(arr, size);
        System.out.println("Maximum Number: "+result.max);
        System.out.println("Minimum Number: "+result.min);

    }
    static class MaxMin{
        int max;
        int min;
    }
    static MaxMin getMaxMin(int[] arr, int n) {
            MaxMin Pair = new MaxMin();
            if(n==0){// for empty array
                System.out.println("Empty array");
            }else {
                Arrays.sort(arr);
                Pair.max = arr[n - 1];
                Pair.min = arr[0];
            }
        return Pair;
    }
}

