package DSA.Recursion.Ques;

public class Sorted_arr {
    public static void main(String[] args) {
        int[] array ={2,6,8,4,9,3};
        int[] array1= {1,4,5,6,7,8};
        //System.out.println(find(arr1,0));
        message(find(array1,0));
    }
    private static boolean find(int[] arr, int index) {
        if (index==arr.length-1){
            return true;
        }
        return arr[index] < arr[index + 1] && find(arr, index + 1);
    }
    static void message(boolean check) {
        if (check) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
