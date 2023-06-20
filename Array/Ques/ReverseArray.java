
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3,5,1,6,7};
        printArr(arr,5);
        reverseArr(arr,0,4);
        System.out.println("Reversed array");
        printArr(arr,5);
    }
    static void reverseArr(int[] arr,int start, int end) {
        int temp;
        if (start >= end)
            return;

        temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;
        reverseArr(arr,start+1,end-1);
    }
    static void printArr(int[] arr, int size){
        for (int i = 0; i <size; i++) {
            System.out.print(arr[i]);
        }
        System.out.println(" ");
    }
}
//    Time Complexity: O(n)
//    Auxiliary Space: O(n)
