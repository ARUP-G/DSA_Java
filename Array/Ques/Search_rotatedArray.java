
// There is an integer array nums sorted in ascending order (with distinct values).
// Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
// such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
// For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

// Given the array nums after the possible rotation and an integer target,
// return the index of target if it is in nums, or -1 if it is not in nums.
public class Search_rotatedArray {
    public static void main(String[] args) {
        int[] arr ={1,3,4,5,7,8,9};
        int n = arr.length;
        int k = 2; // Rotation till
        System.out.println("Original Array: ");
        printArr(arr);

        System.out.println("After rotation: ");
        leftRotate(arr,k,n);

        printArr(arr);
        int res= search(arr,1);
        System.out.println("Index of target: "+res);

    }
    static void leftRotate(int[] arr, int k, int n){
        // make a temp array
        int[] temp = new int[k];

        for (int i=0; i<k; i++){
            temp[i] = arr[i];
        }

        //remaining array
        for(int i=k;i<n;i++){
            arr[i-k] = arr[i];
        }
        // adding temp array to main array
        for (int i = 0; i < k; i++) {
            arr[i+n-k] = temp[i];
        }
    }
    static int search(int[] nums, int target) {
        int n =nums.length;
        int left = 0;
        int right = n-1;
        int mid;

        while(left<=right)
        {
            mid = (left+right)/2;

            //  If the mid = target
            if(nums[mid]==target)
                return mid;

            // If middle element is bigger than left element
            else if(nums[mid]>=nums[left])
            {
                // if target is in between left and middle element
                if(target>=nums[left] && target<=nums[mid]  )
                    right = mid-1;

                // if target is in between middle and right element
                else
                    left = mid+1;
            }
            // if middle element is bigger than right element
            else
            {   // if target is in between mid and right element
                if(target>=nums[mid] && target<=nums[right])
                    left = mid+1;
                // if target is in between left and middle element
                else
                    right = mid-1;
            }
        }
        return -1;
    }
    static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
