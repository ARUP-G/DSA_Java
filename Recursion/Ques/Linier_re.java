package DSA.Recursion.Q;

public class Linier_re {
    public static void main(String[] args) {
        int[] array = {1,3,4,5,6,7,8};
        int target = 8;
        System.out.println(lin_search(array,target,0));
    }

    private static boolean lin_search(int[] arr, int target, int i) {
        if(target <= arr.length){
            return false;
        }
        return (arr[i]==target) || lin_search(arr, target, i+1);

    }

}
