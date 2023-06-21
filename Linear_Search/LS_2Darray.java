package DSA.Linear_Search;

import java.util.Arrays;

public class LS_2Darray {
    public static void main(String[] args) {
        int[][] arr={
                {10, 20, 30 },
                {40, 50},
                {60, 70, 80},
                {90, 199, 100}
        };
        int find=20;
        // format of the return of the function
        // return {row,col}
        int [] ans= findPosition(arr,find);
        System.out.println("Position of the target: "+Arrays.toString(ans));
        System.out.println("Max element in matrix: "+max(arr));
        System.out.println("Min element in matrix: "+min(arr));
    }
    
    static int[] findPosition(int[][] array,int target){
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == target) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    };
    static int max(int[][] array) {
        //int max = array[0][0];
        int max = Integer.MIN_VALUE;// alternate
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] > max) {
                    max = array[row][col];
                }
            }
        }
        return max;
    };
    static int min(int[][] array) {
        //int min = array[0][0];
        int min = Integer.MAX_VALUE;// alternate
        //enhance
        for (int[] ints : array) {
            for (int item : ints) {
                if (item < min) {
                    min = item;
                }
            }
        }
        return min;
    };

}

