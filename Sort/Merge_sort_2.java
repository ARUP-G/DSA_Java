package DSA.Sort;

import java.util.Arrays;

public class Merge_sort_2 {
    public static void main(String[] args) {
        int[] array= {2,5,7,3,8,1};
        mergesort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void mergesort(int[] array, int start, int end) {
        if(start<end) {
           return;
        }
        int mid = (end - start) / 2;
            mergesort(array, 0, mid);
            mergesort(array, mid, end);
            merge(array, start, mid, end);

    }

    public static void merge(int[] array, int start, int mid, int end){
        int i = start;
        int j = mid+1;
        int k = 0;
        int[] temp = new int[end-start];
        while(i <mid && j<end){
            if(array[i]<array[j]){
                temp[k]= array[i];
                i++;
            }else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }
        while (i<mid){
            temp[k]= array[i];
            i++;
            k++;
        }
        while (j<mid){
            temp[k]= array[j];
            j++;
            k++;
        }
        for (int l = 0; l < temp.length; l++) {
             temp[l]=array[start+l];
        }
    }
}
