package DSA.Sort;

import java.util.Arrays;

public class BubbleSort1 {
    public static void main(String[] args) {
        int[] arr= {1,8,9,5,3,2,6,7};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        for (int i =0; i<arr.length; i++){
            for (int j =1;j<arr.length-1; j++){
                if(arr[j-1]<arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
}
