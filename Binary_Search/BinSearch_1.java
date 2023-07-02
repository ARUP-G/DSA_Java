package DSA.Binary_Search;

public class BinSearch_1 {
    public static void main(String[] args) {
        // input array has to be sorted for the search
        int[] arr ={10,9,7,5,1,0,-2,-8,-40};
        int find= -2;
        int  ans = BinSearch(arr,find);
        System.out.println(ans);
    }
    static int BinSearch(int[] array,int target){
        int start = 0;
        int end = array.length-1;

        while (start<=end){
            int mid= end-(end - start)/2; //int mid = start + (end - start) / 2; (same)

            if (array[mid] == target) {
                return mid;
            }
            // conditions for descending order array
            if (target>array[mid]){
                end= mid -1;
            }
            else if (target<array[mid]){
                start=mid+1;
            }
        }
        return -1;
    }
}
