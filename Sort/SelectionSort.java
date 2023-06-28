package DSA.Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void  main(String[] args){
        int[] arr ={4,2,5,3,1};
        SelSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void SelSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length -i -1;
            int max = findMax(arr,0,end);
            swap(arr,max,end);
        }
    }
     static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int findMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start ; i <= end ; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
