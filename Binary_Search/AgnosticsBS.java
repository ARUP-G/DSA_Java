package DSA.Binary_Search;

public class AgnosticsBS {
    public static void main(String[] args) {

        int[] arr = {10, 9, 7, 5, 1, 0, -2, -8, -40};

        int find = 0;
        int ans = AGBS(arr, find);
        System.out.println(ans);
        CountElements(arr);
    }
    static void CountElements(int[] array){
        int count = array.length;
        System.out.println("Number of elements present in the array: " +count);
    }

    static int AGBS(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        boolean isAscending = array[start]<array[end];

        while(start<=end){
            int mid = end - (end - start) / 2; //int mid = start + (end - start) / 2; (same)
            if (array[mid] == target) { //if target and the mid-element is same.// terminating condition
                return mid; // returning the index number.
            }
            if (isAscending){
                if (target<array[mid]){
                    end= mid-1;
                }
                else {
                    start= mid+1;
                }
            }else {
                if (target>array[mid]){
                    end= mid-1;
                }else{
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
