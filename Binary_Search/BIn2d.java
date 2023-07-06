package DSA.Binary_Search;

import java.util.Arrays;

public class BIn2d {
    public static void main(String[] args) {
        int [][] arr={
            {9,12,13,20},
            {22,26,28,33},
            {36,40,42,44},
            {41,49,50,55}
        };
        int find = 51;
        System.out.println(Arrays.toString(search(arr, find)));
    }
    static int[] search(int[][] mat,int target) {
        int row = 0;
        int column = mat.length - 1;

        while (row < mat.length && column >= 0) {
            if (mat[row][column] == target) {
                return new int[]{row,column};
            }
            if (mat[row][column] > target) {
                column--;
            } else {
                row++;
            }
        }return new int[]{-1,-1};
    }

}
