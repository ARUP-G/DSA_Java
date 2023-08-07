package DSA_Java.random;

import java.util.Scanner;

public class functions_1 {
    public static void main(String[] args){
        mul();
        int result=divide();
        System.out.println(result);
    }
    // Function of void type that is not returning anything
    static void mul(){
        Scanner input = new Scanner(System.in);
        System.out.println("Num1= ");
        int Num1= input.nextInt();
        System.out.println("Num2= ");
        int Num2= input.nextInt();
        int mul= Num1*  Num2;
        System.out.println(mul);
    }
    //Function that have a return type.
    static int divide(){
        Scanner input = new Scanner(System.in);
        System.out.print("Num1= ");
        int Num1= input.nextInt();
        System.out.print("Num2= ");
        int Num2= input.nextInt();
        int div= Num1/ Num2;
        return div;
        // no line after this return statement is executable.
    }
}
