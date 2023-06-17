package DSA.Array_ArrayList.Ques;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {3,5,30,1,7,9,66};
        MaxMinFind(arr);
        //System.out.println(MaxMinFind(arr));
    }

    static void MaxMinFind(int[] arr){

        int max= arr[0];
        int min= arr[arr.length-1];
        if (arr.length == 0) {
            System.out.println("Empty");
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max){
                max = arr[i];
            }
            if (arr[i] <min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }


}
