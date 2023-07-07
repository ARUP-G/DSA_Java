package DSA.Binary_Search.Ques;

public class Ceiling_of_Number {
    public static void main(String[] args) {
        int[] arr = {1,2,4,10,11,14,20};

        int CeilingOf=12;
        CeilingNum(arr,CeilingOf);
    }
    // return the index of the smallest element of the arr which is >= target
    static void CeilingNum(int[] arr, int target){

        int start=0;
        int end = arr.length-1;
        boolean isAscending = arr[start] < arr[end];
        while (start<=end){
            int mid = start +(end-start)/2;
            if(mid>=target){
                System.out.println(mid);
            }
            if (isAscending){ // boolean is used here
                if(target<arr[mid]){
                    end = end-1;
                }else{
                    start= mid+1;
                }
            }else {//not ascending
                if(target<arr[mid]){
                    start=mid+1;
                }
                else {
                    end =mid -1;
                }
            }
        }
        System.out.println("Index of the celling: "+start);
        System.out.println("Celling of ("+target + ") is: " +arr[start]);
    }
}
