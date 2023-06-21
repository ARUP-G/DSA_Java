package DSA.Linear_Search;

public class LS_in_range {
    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 4, 33};
        int find = 10;
        System.out.println(find_num_in_range(arr,find,0,2 ));;
    }
    static int find_num_in_range(int[] array,int target,int start, int end){
        if (array.length==0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = array[i];
            if (element==target){
                return i;
            }
        }
        return -1;
    }
}