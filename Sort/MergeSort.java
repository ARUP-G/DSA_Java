package DSA.Sort;


import java.util.Arrays;

/*steps
    * 1.Division Phase – Divide the array(list) into 2 halves by finding the midpoint of the array(list).
        Midpoint (m) = (left + right)/ 2
        Here left is the starting index & right is the last index of the array(list)
   * 2.Recursion Phase –
        Call Merge Sort on the left sub-array (sub-list)
        Call Merge Sort on the right sub-array (sub-list)
   * 3.Merge Phase –
        Call merge function to merge the divided sub-arrays back to the original array.
        Perform sorting of these smaller sub arrays before merging them back.
        */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,9,2,6,1};
        int[] array= mergeSort(arr);
        System.out.println(Arrays.toString(array));


    }
    static  int[] mergeSort(int[]arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left= mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        //(Arrays.copyOfRange) --> Copies the specified range of the specified array into a new array.
        // Syntax [ Arrays.copyOfRange(array,from: index of array, to: normal number of item(not index) ) ]
        // so here in left '0' is the index number & mid is nirmal number (in this case 2)
        // in right mid(2) is the index number & arr.length(5) is normal number
        return merge(left,right);
    }

    static int[] merge(int[] first, int[] second){
        int i=0; // iterator for first array
        int j=0; // iterator for second array
        int k=0; // iterator for new temp array

        int[] mixTemp = new int[first.length+second.length] ; // temporary array to store the sorted main array

      while(i<first.length && j<second.length){
          if (first[i]< second[j]){
              mixTemp[k] = first[i];
              i++;
          }else {
              mixTemp[k] = second[j];
              j++;
          }
          k++; // common part for if and else part.

      }
        // possible that one of the part is not complete
        // remaining part has to be added to the new temp array
        // remaining element will be sorted first
        //there can be more than one element left in the 2 arrays
        // if the main array is of even number of elements one part will have 2 elements(sorted) extra.
        while (i< first.length){
            mixTemp[k] = first[i];
            i++;
            k++;
        }
        while (j< second.length){
            mixTemp[k] = second[j];
            j++;
            k++;
        }
        return mixTemp;

    }


}
