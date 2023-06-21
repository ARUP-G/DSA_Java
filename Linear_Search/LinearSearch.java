public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,8,4,0,5,1,9};
        int find = 8;
        int ans = linearSearch(arr,find);
        System.out.println(ans);

    }
    static int linearSearch(int[] num,int target) {
        if (num.length == 0) {
            System.out.println("Null array");
        }
        for (int i = 0; i < num.length; i++) {
            int element = num[i];
            if (element == target) {
                return i;
            }
        }
        System.out.println("Not found");
        return 0;
        }
    }

