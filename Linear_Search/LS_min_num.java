package DSA.Linear_Search;

public class LS_min_num {
    public static void main(String[] args) {
        int[] arr = {10,20 ,-9, 8 , 4 };
        System.out.println("minimum number: "+min(arr));
        System.out.println("Maximum Number: "+max(arr));

    }
    // assuming an non empty array
    static int min(int[] array){
        int ans = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<ans){
                ans = array[i];
            }
        }
        return ans;
    }
    static int max(int[] array){
        int ans = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>ans){
                ans = array[i];
            }
        }
        return ans;
    }
}
