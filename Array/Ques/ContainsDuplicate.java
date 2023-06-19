package DSA.Array.Ques;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,5,3,1,5};
        System.out.println(checkDuplicate(arr));
    }
    static boolean checkDuplicate(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for(int j=i+1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
