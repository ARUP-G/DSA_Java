package DSA.Sort;

import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={2,4,1,5,3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Swap(int[] arr, int first, int second ){
        int temp = arr [first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    // dividing the array in sorted and unsorted part
    static void insertion(int[] arr) {
        for (int i=1;i<arr.length;i++){
            int current = arr[i];
            int j =i-1;

            while (j>=0 && arr[j]>current){
                arr[j+1]= arr[j];
                j--;
            }
            //Placing the current element
            arr [j+1] = current;
        }
    }
}
