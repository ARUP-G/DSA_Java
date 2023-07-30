package DSA_Java.Array.Ques;

import java.util.Arrays;

//Given an array of N integers where each value represents the number of chocolates in a packet.
//        Each packet can have a variable number of chocolates.
//        There are m students, the task is to distribute chocolate packets such that:
//
//        1.Each student gets one packet.
//        2.The difference between the number of chocolates in the packet with maximum chocolates
//        and the packet with minimum chocolates given to the students is minimum.
//        Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3
//        Output: Minimum Difference is 2
//        Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5
//        Output: Minimum Difference is 6

public class ChocolateDistribution {
    public static void main(String[] args) {
        int[] arr = {1,4,6,2,8,5,8,3,9,2,12,7};
        int size = arr.length;
        int studentNum = 5;
        System.out.println("Minimum difference is: "+ min_Difference(arr,size,studentNum));

    }
    static int min_Difference(int[] arr, int n, int m){ // n= size of array

        //check num of packets of chocolates & number of student is not 0
        if(n==0||m==0){
            return 0;
        }

        //sort given the array
        Arrays.sort(arr);

        //student number must be lesser than packets
        if(n<m){
            return -1;
        }

        // initialize min difference
        int min_diff = Integer.MAX_VALUE;

        // Find the sub-array of size m
        // such that difference between
        // last (maximum in case of
        // sorted) and first (minimum in
        // case of sorted) elements of
        //sub-array is minimum.
        for (int i=0; i+m-1<n;i++){        //for this arr the loop will run till i=7 as (7+5-1=11) < 12(n)
            int diff = arr[i+m-1]-arr[i];
            if(diff < min_diff){
                min_diff = diff;
            }
        }
        return min_diff;

    }
}
