package DSA.Recursion.Q;

public class pattern1 {
    public static void main(String[] args) {
          int row = 5;
          int column = 0;
        pattern(row,column);
        pattern_2(row,column);

    }

    private static void pattern(int row, int column) {

        if(row==0){
            return;
        }
        if (column<row){
            System.out.print("*");
            pattern(row, column+1);
        }
        else {
            System.out.println();
            pattern(row-1, 0);
        }
    }
    private static void pattern_2(int row, int column) {

        if(row==0){
            return;
        }
        if (column<row){
            pattern_2(row, column+1);
            System.out.print("*");

        }
        else {
            pattern_2(row-1, 0);
            System.out.println();

        }
    }
}
