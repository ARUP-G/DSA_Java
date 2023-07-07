package DSA.Recursion.Q;
// Binary search using recursion
public class BinSearch_Re {
    public static void main(String[] args) {
        int[] arr = {1,5,9,11,15,20};
        int target = 5;
        int resultIndex = search(arr,target,0,arr.length-1);
        System.out.println(resultIndex);
    }
    static int search(int []arr,int target,int start,int end ){
        if(start>end){
            return -1;
        }
        int mid = end - (end-start)/2;
        if (arr[mid]==target){
            return mid;
        }
        if(arr[mid]< target){
            return search (arr,target,mid+1,end);
        }
        return search(arr,target,start,mid-1);
    }
}
