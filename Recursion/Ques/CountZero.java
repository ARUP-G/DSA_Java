package DSA.Recursion.Ques;

public class CountZero {
    public static void main(String[] args) {
        int num = 20202;
        int result = count_zero(num,0);
        System.out.println(result);
    }
    static int count_zero(int num,int count){

            if (num == 0) {
                return count;
            }
            int lastDig = num % 10;
            if (lastDig == 0) {
                return count_zero(num/10,count+1);
            }
            return count_zero(num/10,count);

    }
}
