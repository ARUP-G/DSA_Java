
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //syntax
        // datatype[] variable_name = new datatype[size]
        int[] num = new int[5]; // 5 objects of array
        // (int[] num) -> Happens at runtime
        //(new int[5]) -> Happens at compile time , this is dynamic memory allocation
        // num[0]=12;
        // System.out.println(num[0]);
        System.out.println("Enter 5 number: ");
        for (int i = 0; i < num.length; i++) {
            num[i]= input.nextInt();
        }
        for (int j = 0; j < num.length; j++) {
            System.out.print(num[j]+ " ");
        }
        // Another way of printing array (Using toString method)
        System.out.println("or" +Arrays.toString(num));
        System.out.println();

        // 2D array
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements of the array[3x3]: ");
        for (int i = 0; i < 3/*row*/; i++) {
            for (int j = 0; j < 3/*column*/; j++) {
                arr[i][j]= input.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();

            int[][] mat = {
                    {1,4,6,2},
                    {3,56,8},
                    {1,5,9,4,2,8}
            };
            for (int row = 0; row < mat.length ; row++) {
                for (int col = 0; col < mat[row].length; col++) {
                    System.out.println(mat[row][col]+" " );
                    System.out.println();
                }
            }
        }
    }
}
/* Arrays are mutable
* In cpp arrays has continuous memory allocation.
* In java arrays may or may not be in continuous memory,
* JVM handles array allocation.
* In Java reference types are stored in the Heap area.
* As arrays are also reference types,(they can be created using the “new” keyword)
* they are also stored in the Heap area.
*  (https://www.geeksforgeeks.org/where-is-the-memory-allocated-for-arrays-in-java/)*/