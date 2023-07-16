package DSA.Recursion.Q;

public class PadovanSequence {
    //Padovan Sequence: 1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16, 21, 28, 37
    public static void main(String[] args) {
        int target = 4;// oth term is 1
        System.out.println(Padovan(target));
    }
//    static int Padovan2(int n){
//        int prePreNum=1;
//        int PreNum=1;
//        int currNum = 1;
//        int nextNum= 1;
//        //base condition
//        for (int i =3; i <= n; i++) {
//            nextNum = prePreNum+PreNum;
//            prePreNum = PreNum;
//            PreNum = currNum;
//            currNum = nextNum;
//        }
//            return nextNum;
    //    }
    static int Padovan(int n){

        if (n<3)
            return 1;
        //Recurrence relation
        return Padovan(n-2)+Padovan(n-3);
    }
}
